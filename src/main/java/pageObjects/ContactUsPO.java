package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.GlobalVars;

public class ContactUsPO extends BasePO {

    public void navigateToContactUsPage() {
        navigateToUrl(GlobalVars.HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    private @FindBy(how = How.XPATH, using = "//input[@name=\"first_name\"]")
    WebElement firstNameTextField;

    private @FindBy(how = How.XPATH, using = "//input[@name=\"last_name\"]")
    WebElement lastNameTextField;

    private @FindBy(how = How.XPATH, using = "//input[@name='email']")
    WebElement uniqueEmailAddressField;

    private @FindBy(how = How.XPATH, using = "//textarea[@name='message']")
    WebElement uniqueCommentField;

    private @FindBy(how = How.XPATH, using = "//input[@value='SUBMIT']")
    WebElement submitButton;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmissionMessageText;

    public void setUniqueFirstName() {
        sendKeys(firstNameTextField, "AutoFN" + generateRandomNumber(5));
    }

    public void setUniqueLastName() {
        sendKeys(lastNameTextField, "AutoLN" + generateRandomNumber(5));
    }

    public void setUniqueEmailAddress() {
        sendKeys(uniqueEmailAddressField, "AutoEmail" + generateRandomNumber(6) + "@mail.com");
    }

    public void setUniqueComment() {
        sendKeys(uniqueCommentField, "Hello World" + generateRandomString(10));
    }

    public void setSpecificFirstName(String firstName) {
        sendKeys(firstNameTextField, firstName);
    }

    public void setSpecificLastName(String lastName) {
        sendKeys(lastNameTextField, lastName);
    }

    public void setSpecificEmailAddress(String emailAddress) {
        sendKeys(uniqueEmailAddressField, emailAddress);
    }

    public void setSpecificComment(String comment) {
        sendKeys(uniqueCommentField, comment);
    }

    public void submitButtonClick() {
        waitForElementAndClick(submitButton);
    }

    public void successfulSubmissionMessage() {
        waitFor(successfulSubmissionMessageText);
        Assert.assertEquals(successfulSubmissionMessageText.getText(), "Thank You for your Message!");
    }

}
