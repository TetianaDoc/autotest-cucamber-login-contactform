@click-buttons @regression

Feature: Webdriver University - Click Buttons Page


  Background:
    Given Go to Click Buttons Page


  Scenario: Validate WebElement Click
    When I click on button using WebElement click method
    Then I presented with a successful webelement click message


  @scenario2
  Scenario: Validate JavaScript Click
    When I click on button using JavaScript click method
    Then I presented with a successful JavaScript click message

  Scenario: Validate Action Move&Click
    When I click on button using Action Move&Click method
    Then I presented with a successful Action Move&Click message
