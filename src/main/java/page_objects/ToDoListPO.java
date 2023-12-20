package page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ToDoListPO extends BasePO {
    private @FindBy(xpath = "//ul/li")
    WebElement item;

    public void clickOnItemToBeCompleted() {
        item.click();
    }

    private @FindBy(css = ".completed")
    WebElement completedElement;

    public void isItemCompleted() {
        Assert.assertSame(true, completedElement.isDisplayed());
    }

    private @FindBy(css = "input[placeholder='Add new todo']")
    WebElement placeholderInput;

    public int numberOfItems() {
        return unorderedList.size();
    }

    public void addNewItem() {
        String text = "It is New To-Do Item";
        placeholderInput.sendKeys(text);
        placeholderInput.sendKeys(Keys.RETURN);
    }

    private @FindBy(xpath = "//*[text()=' It is New To-Do Item']")
    WebElement addedNewItemText;

    public void isItemAdded(int before, int after) {
        Assert.assertEquals(after, before + 1);
    }

    private @FindBy(xpath = "//*[text()=' It is New To-Do Item']/span/i")
    WebElement trash;

    private @FindBy(xpath = "//ul/li")
    List<WebElement> unorderedList;

    public int getSizeOfList() {
        return unorderedList.size();
    }

    public void deleteItem() {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", trash);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void isItemDeleted(int before, int after) {
        Assert.assertEquals(before, after + 1);
    }
}
