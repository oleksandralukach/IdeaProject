Feature: Home Page Verification

  Background Scenario Outline:
    Given user open a website
    Then user log in with valid credentials "username" and "password"

  Scenario: verify the message “Welcome (First_name)" on the right top header
    Then user should validate welcome message

  Scenario: verify user the home page title
    Then user should see the home title is displayed

  Scenario: verify banking accounts
    Then user should see banking account title
    And user should see checking title
    And user should see savings title
    And user should see external title

  Scenario: verify transactions/transfers
    Then user should see transactions/transfer title
    And user should see deposit title
    And user should see withdraw title
    And user should see transfer between acc title
    And user should see Visa Direct Transfer title

  @DataTable
  Scenario: verify profile information
    Then user verify profile information
    Then verify profile has valid information
      | address                     | locality | region | postal code | country | home phone | mobile phone |
      | 3322 W Hutchinson St, apt 2 | Chicago  | IL     | 60618       | USA     | 8472248123 | 773995369    |

  Scenario: verify notifications button
    When user is on home page
    Then user should see notifications button

  Scenario: verify message button
    When user is on home page
    Then user should see message button

  Scenario: verify Digital Bank image
    When user is om home page
    Then user should see Digital Bank Logo image

    Scenario: verify help mark button
      When user is om home page
      Then user should see help button

      Scenario: verify search button