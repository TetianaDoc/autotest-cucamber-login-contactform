package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.AccordionButtonsPO;
import utils.GlobalVars;

public class AccordionButtonsSteps {
    AccordionButtonsPO accordionButtonsPO;
    public AccordionButtonsSteps(AccordionButtonsPO accordionButtonsPO){
        this.accordionButtonsPO=accordionButtonsPO;
    }

    @Given("Go to Accordion Items Page")
    public void goToAccordionItemsPage() {
        accordionButtonsPO.navigateToUrl(GlobalVars.HOMEPAGE_URL + "/Accordion/index.html");
    }

    @When("I click on {} item button")
    public void clickOnAccordionButton(String accordion) {
        accordionButtonsPO.clickAccordionButton(accordion);
    }

    @Then("Text {} appears")
    public void isTextAppears(String description) {
        accordionButtonsPO.isDescriptionAppears(description);
    }
}
