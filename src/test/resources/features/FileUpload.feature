@file-upload @regression

Feature: Webdriver University - File Upload Page

  Background:
    Given Go to File Upload Page

  Scenario: Validate successful file upload
    And I choose file in opened file system window
    Then I should be presented with a successful file uploaded message

  Scenario: Validate no file upload
    When I click on Submit button with no file chosen
    Then I should be presented with a need to select file message




