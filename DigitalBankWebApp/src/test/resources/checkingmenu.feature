Feature: verify Checking functionality

  Background Scenario Outline:
    Given user open a website
    Then user log in with valid credentials "username" and "password"

  Scenario: verify checking creation
    When user click on checking title
    And user should see "New Checking" option and click on it
    Then user should see "New Checking Account" form
