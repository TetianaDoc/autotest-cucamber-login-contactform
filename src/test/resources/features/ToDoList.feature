@to-do-list @regression

Feature: WebDriver University - ToDo List Page

  Background:
    Given Go to To-Do List Page

  Scenario: Validate the Item is completed function
    When I click on the Item
    Then The Item is crossed by line

  Scenario: Validate Add new To-Do Item
    When I write a new todo item in placeholder
    Then New todo item appears in ToDo List

    @delete-item
  Scenario: Validate the Item is added and deleted
    When I write a new todo item in placeholder
    And I click on the Trash icon
    Then The Item is deleted
