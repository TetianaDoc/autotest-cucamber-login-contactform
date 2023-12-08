package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FileUploadPO;

public class FileUploadSteps {

    private FileUploadPO fileUploadPO;
    public FileUploadSteps(FileUploadPO fileUploadPO) {
        this.fileUploadPO = fileUploadPO;
    }

    @Given("Go to File Upload Page")
    public void go_to_file_upload_page() {
        fileUploadPO.navigateToUrl("https://www.webdriveruniversity.com/File-Upload/index.html");
        //fileUploadPO.navigateToFileUploadPage();
    }
//
//    @When("I click on Choose file button")
//    public void click_on_choose_file_button() {
//        fileUploadPO.clickOnChooseFileButton();
//    }

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
//    @Given("Go to File Upload Page")
//    public void go_to_file_upload_page() {
//        fileUploadPO.navigateToFileUploadPage();
//    }
//
//    @When("I click on Choose file button")
//    public void click_on_choose_file_button() {
//        fileUploadPO.clickOnChooseFileButton();
//    }
//
//    @When("I choose file in opened file system window")
//    public void choose_file_in_opened_file_system_window() {
//        fileUploadPO.openFile();
//    }
//
//    @When("I click on Submit button")
//    public void click_on_submit_button() {
//        fileUploadPO.clickOnSubmitButton();
//    }
//
//    @Then("I should be presented with a successful file uploaded message")
//    public void should_be_presented_with_a_successful_file_uploaded_message() {
//        fileUploadPO.successfulUploadMessage();
//    }
//
//    @Then("I should be presented with a need to select file message")
//    public void iShouldBePresentedWithNeedToSelectFileMessage() {
//        fileUploadPO.unsuccessfulUploadMessage();
//    }
}
