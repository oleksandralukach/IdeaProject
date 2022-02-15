Feature: Change Password Feature Verification

  @DataTable
  Background Scenario Outline:
    Given user open a website
    When user log in with valid credentials "username" and "password"
    Then user is on home page
    And user should see personal profile icon on right top corner
    When user click on personal profile icon
    Then user should see dropdown with valid fields
    When user click on second field "Change password"
    Then user is on "Change Password" page
    And "Change Password" page has valid information/elements
      | Current Password | New Password | Confirm New Password | Update Password |

  Scenario: verify user can change password with valid current password and valid new password
    When user enters valid current password "123456789Ab" in "Current Password" input field
    And user enters valid new password "123456789Ac" in "New Password" input field
    And user enters valid new password "123456789Ac" in "Confirm New Password" input field
    And click on "Update password" button
    Then verify user see the message "Password Updated Successfully." on "Change Password" page

  Scenario Outline: verify user can not change password with valid current password and invalid new password
    Given user is on "Change Password" page
    And "Change Password" page has valid information/elements
    When user enters valid current password "123456789Ab" in "Current Password" input field
    And user enters invalid "<new password>" in "New Password" input field
    Examples:
      | new password |
      | 1            |
      | 123456789    |
      | 123456789A   |
      | 123456789c   |
      | Ab           |
      | 123Ac        |

    And user enters invalid new password "123" in "Confirm New Password" input field
    And click on "Update password" button
    Then verify user see the message "Passwords must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" under the "New Password" input field on "Change Password" page

  Scenario: verify user can not change password with invalid current password and valid new password
    When user enters invalid current password "1" in "Current Password" input field
    And user enters valid new password "123456789Ac" in "New Password" input field
    And user enters valid new password "123456789Ac" in "Confirm New Password" input field
    And click on "Update password" button
    Then verify user see the error message "Current Password does not match what is on record. Please enter the correct current password." in red field on top of the "Change Password" page

  Scenario: verify user can not change password with valid current password and invalid "Confirm New Password" input
    When user enters valid current password "123456789Ab" in "Current Password" input field
    And user enters valid new password "123456789Ac" in "New Password" input field
    And user enters invalid new password "1" in "Confirm New Password" input field
    And click on "Update password" button
    Then verify user see the message "Passwords do not match" on "Change Password" page under the "Confirm New Password" input field on "Change Password" page

