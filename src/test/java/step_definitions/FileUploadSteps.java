package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.FileUploadPO;

public class FileUploadSteps {

    private FileUploadPO fileUploadPO;
    public FileUploadSteps(FileUploadPO fileUploadPO) {
        this.fileUploadPO = fileUploadPO;
    }

    @Given("Go to File Upload Page")
    public void go_to_file_upload_page() {
        fileUploadPO.navigateToFileUploadPage();
    }

    @When("I choose file in opened file system window")
    public void i_choose_file_in_opened_file_system_window() {
        fileUploadPO.openFile();
    }

    @Then("I should be presented with a successful file uploaded message")
    public void i_should_be_presented_with_a_successful_file_uploaded_message() {
        fileUploadPO.successfulUploadMessage();
    }

    @When("I click on Submit button with no file chosen")
    public void i_click_on_submit_button_with_no_file_chosen() {
        fileUploadPO.clickOnSubmitButton();
    }

    @Then("I should be presented with a need to select file message")
    public void i_should_be_presented_with_a_need_to_select_file_message() {
        fileUploadPO.unsuccessfulUploadMessage();
    }
}
