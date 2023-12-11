package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.ClickButtonsPO;

public class ClickButtonsSteps {
    public ClickButtonsPO clickButtonsPO;

    public ClickButtonsSteps(ClickButtonsPO clickButtonsPO) {
        this.clickButtonsPO = clickButtonsPO;
    }

    @Given("Go to Click Buttons Page")
    public void goToClickButtonsPage() {
        clickButtonsPO.navigateToClickButtonsPage();
    }

    @When("I click on button using WebElement click method")
    public void clickOnButtonUsingWebElementClickMethod() {
        clickButtonsPO.clickOnWebElement();
    }

    @Then("I presented with a successful webelement click message")
    public void presentedWithSuccessfulWebelementClickMessage() {
        clickButtonsPO.successfulWebelementClickMessage();
    }

    @When("I click on button using JavaScript click method")
    public void clickOnButtonUsingJavaScriptClickMethod() {
        clickButtonsPO.clickJavaScriptButton();
    }

    @Then("I presented with a successful JavaScript click message")
    public void iPresentedWithASuccessfulJavaScriptClickMessage() {
        clickButtonsPO.successfulJsMethodClickMessage();
    }

    @When("I click on button using Action Move&Click method")
    public void iClickOnButtonUsingActionMoveClickMethod() {
        clickButtonsPO.clickActionMoveAndClick();
    }

    @Then("I presented with a successful Action Move&Click message")
    public void iPresentedWithASuccessfulActionMoveClickMessage() {
        clickButtonsPO.successfulActionMoveAndClickMessage();
    }
}
