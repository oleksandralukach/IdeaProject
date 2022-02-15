@tc1 @Smoke

Feature: Verify sign in functionality

  Scenario:  Sign in functionality
    Given I am on home page
    When I click Sign in button
    And I enter email to create account
    And I click Create an Account button
    Then I fill up personal information
    Then I fill up address information
    Then I verify title "My Account"