package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePO;
import pageObjects.LoginPO;


public class LoginSteps {
    private LoginPO login_po;
    public LoginSteps(LoginPO login_po) {
        this.login_po = login_po;
    }

    @Given("Go to login page")
    public void go_to_login_page() {
        //login_po.navigateToUrl("https://www.webdriveruniversity.com/Login-Portal/index.html?");
        login_po.navigateToLoginPage();
    }

    @When("I enter a specific username {word}")
    public void i_enter_a_specific_username(String username) {
        login_po.setUsername(username);
    }

    @When("I enter a specific password {}")
    public void i_enter_a_specific_password(String password) {
        login_po.setPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        login_po.clickLoginButton();
    }

    @Then("I should be presented with a validation succeeded message")
    public void iShouldBePresentedWithAValidationSucceededMessage() {
        login_po.validateSuccessfulLoginMessage();
    }

    @And("I enter an invalid password {}")
    public void iEnterAnInvalidPasswordPassword(String password) {
        login_po.setPassword(password);
    }

    @Then("I should be presented with a validation failed message")
    public void iShouldBePresentedWithAValidationFailedMessage() {
        login_po.validateUnsuccessfulLoginMessage();
    }

    @When("I enter a username {word}")
    public void iEnterAUsername(String username) {
        login_po.setUsername(username);
    }

    @And("I enter a password {}")
    public void iEnterAPassword(String password) {
        login_po.setPassword(password);
    }

    @Then("I should be presented with a validation message {}")
    public void iShouldBePresentedWithAValidationMessage(String expectedMessage) {
        login_po.waitForAlertAndValidateText(expectedMessage);
    }
}
