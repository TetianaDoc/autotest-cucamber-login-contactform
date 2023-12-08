package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ContactUsPO;

public class ContactUsSteps {
    private ContactUsPO contactUsPO;

    public ContactUsSteps(ContactUsPO contactUsPO) {
        this.contactUsPO = contactUsPO;
    }

    @Given("I have access the webdriver university contact us page")
    public void i_have_access_the_webdriver_university_contact_us_page() {
        contactUsPO.navigateToContactUsPage();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPO.setUniqueFirstName();
    }

    @When("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUsPO.setUniqueLastName();
    }

    @When("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPO.setUniqueEmailAddress();
    }

    @When("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUsPO.setUniqueComment();
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUsPO.submitButtonClick();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUsPO.setSpecificFirstName(firstName);
    }

    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUsPO.setSpecificLastName(lastName);
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPO.successfulSubmissionMessage();
    }

    @And("I enter a specific email address {word}")
    public void iEnterASpecificEmailAddressBarbara_Star_(String emailAddress) {
        contactUsPO.setSpecificEmailAddress(emailAddress);
    }

    @And("I enter a specific comment {string}")
    public void iEnterASpecificComment(String comment) {
        contactUsPO.setSpecificComment(comment);
    }
}
