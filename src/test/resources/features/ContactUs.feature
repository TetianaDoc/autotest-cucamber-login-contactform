@contact-us @regression

Feature: WebDriver University - Contact Us Page
  Background:
    Given I have access the webdriver university contact us page

  Scenario: Validate Successful Submission - Unique Data
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate Successful Submission - Specific Data
    When I enter a specific first name Barbara
    And I enter a specific last name Star
    And I enter a specific email address AutoEmail1234@mail.com
    And I enter a specific comment "Hello world"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message