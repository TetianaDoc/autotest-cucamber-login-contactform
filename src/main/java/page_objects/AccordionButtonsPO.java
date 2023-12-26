package page_objects;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AccordionButtonsPO extends BasePO {

    public void clickAccordionButton(String accordion) {
        getDriver().findElement(By.id(accordion)).click();
    }

    public void isDescriptionAppears(String description) {
        waitFor(By.xpath("//*[text()='" + description + "']"));
        Assert.assertTrue(getDriver().findElement(By.xpath("//*[text()='" + description + "']")).isDisplayed());
    }
}
