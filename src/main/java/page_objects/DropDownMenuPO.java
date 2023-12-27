package page_objects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DropDownMenuPO extends BasePO {

    public void clickOnDropDown(String menu) {
        getDriver().findElement(By.id(menu)).click();
    }

    public void clickSelectedOption(String value) {
        getDriver().findElement(By.cssSelector("option[value='" + value + "']"));
    }

    public void isSelectedOptionDisplayed(String text) {
        Assert.assertTrue(getDriver().findElement(By.xpath("//option[text()='" + text + "']")).isDisplayed());
    }
}
