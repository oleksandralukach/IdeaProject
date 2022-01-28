Feature: This feature is to test the login functionality

  Developer - Fenton
  Tester - Tatiana
  Reviewed by - Daniel

  Background:
    Given user opens website
    And user is on login page
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    When user hover mouse on Pim menu
    And click on Add Employee Button
    Then verify user is navigated to add employee page
    When user enters valid details on add employee page

@Smoke @Chiraq
  Scenario: Verify user can able to login with valid credentials
    And click on save button
    Then user is navigated to personal detailed page

@Smoke @Elmaz
    Scenario: Verify error message for missing first and last name
      And click on save button
      Then user is navigated to personal detailed page
      Then verify error message for missing name and last name