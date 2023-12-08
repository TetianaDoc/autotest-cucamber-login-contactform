package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.GlobalVars;

public class FileUploadPO extends BasePO {
    public void navigateToFileUploadPage() {
        navigateToUrl(GlobalVars.HOMEPAGE_URL + "/File-Upload/index.html");
    }

    private @FindBy(id = "myFile")
    WebElement chooseFileButton;

    private @FindBy(id = "submit-button")
    WebElement submitFileUploadButton;

    public void clickOnChooseFileButton() {
        waitForElementAndClick(chooseFileButton);
    }

    public void openFile() {
        chooseFileButton.sendKeys("/Users/tetianadotsenko/work/autotest-cucamber-webdriveruniversity.com/files_for_upload/photo.png");
        waitForElementAndClick(submitFileUploadButton);
    }

    public void clickOnSubmitButton(){
        waitForElementAndClick(submitFileUploadButton);
    }

    public void successfulUploadMessage() {
        waitForAlertAndValidateText("Your file has now been uploaded!");
    }

    public void unsuccessfulUploadMessage() {
        waitForAlertAndValidateText("You need to select a file to upload!");
    }
}
