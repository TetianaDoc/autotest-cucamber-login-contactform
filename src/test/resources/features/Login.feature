@login @regression

Feature: WebDriver University - Login

  Background:
    Given Go to login page
@login1
  Scenario: Validate Successful login
    When I enter a specific username webdriver
    And I enter a specific password webdriver123
    And I click login button
    Then I should be presented with a validation succeeded message

  Scenario: Validate Unsuccessful login
    When I enter a specific username webdriver
    And I enter an invalid password password123
    And I click login button
    Then I should be presented with a validation failed message

    @smoke
  Scenario Outline: Validate successful & unsuccessful login
    When I enter a username <username>
    And I enter a password <password>
    And I click login button
    Then I should be presented with a validation message <loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | password123  | validation failed      |