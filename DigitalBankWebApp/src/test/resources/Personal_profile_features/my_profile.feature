Feature: My Profile Feature Verification

  @DataTable
  Background Scenario Outline:
    Given user open a website
    When user log in with valid credentials "username" and "password"
    Then user is on home page
    And user should see personal profile icon on right top corner
    When user click on personal profile icon
    Then user should see dropdown with valid fields
    When user click on first field "My profile"
    Then user is on "My profile" page
    And user see all valid fields
      | Title | First Name | Last Name | Home Phone | Mobile Phone | Work Phone | address | locality | region | postal code | country |
    And user see button "Submit"
    And user see button "Reset"


  @DataTable
  Scenario: verify profile has valid input information
    Then verify user should see valid input information
      | Title | First Name | Last Name | address     | locality     | region | postal code | country | home phone | mobile phone |
      | Mrs   | Alex       | Dykun     | 10 Long Way | Santa Monica | CA     | 80440       | USA     | 8472248123 | 773995369    |

  Scenario: verify Reset Button
    When user click on Reset Button
    Then user should see all input field are empty
    And user should see message "

  Scenario: verify Submit Button
    When user click on Submit Button
    Then user should see message "Profile Updated Successfully."