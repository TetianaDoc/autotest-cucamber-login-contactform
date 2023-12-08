package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class LoginPO extends BasePO {

    public void navigateToLoginPage() {
        navigateToUrl(GlobalVars.HOMEPAGE_URL + "/Login-Portal/index.html?");
    }

    private @FindBy(id = "text")
    WebElement usernameField;

    private @FindBy(id = "password")
    WebElement passwordField;

    private @FindBy(id = "login-button")
    WebElement loginButton;

    public void setUsername(String username) {
        sendKeys(usernameField, username);
    }

    public void setPassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clickLoginButton() {
        waitForElementAndClick(loginButton);
    }

    public void validateSuccessfulLoginMessage() {
        waitForAlertAndValidateText("validation succeeded");
    }

    public void validateUnsuccessfulLoginMessage() {
        waitForAlertAndValidateText("validation failed");
    }
}
