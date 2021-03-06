Feature: Register to Digital Bank application

  Scenario: As a user, I want to successfully login with valid credentials
    Given User navigates to Digital Bank login page
    And Verify that web title is "Digital Bank"
    When User logs in with following credentials
      | username         | password    |
      | test22@gmail.com | 123456789Ac |
    Then User successfully logged in to home page


  Scenario: Error message Validation for Invalid Password

    Given User navigates to Digital Bank login page
    And Verify that web title is "Digital Bank"
    When User logs in with "test22@gmail.com " and "123"
    Then User should be displayed with the error message "Error Invalid credentials or access not granted."


  Scenario: Error message Validation for invalid credentials

    Given User navigates to Digital Bank login page
    And Verify that web title is "Digital Bank"
    When User logs in with "Invalid@testemail.com" and "Password1"
    Then User should be displayed with the error message "Error Invalid credentials or access not granted."


  Scenario: Error message Validation for Invalid User and Pwd

    Given User navigates to Digital Bank login page
    And Verify that web title is "Digital Bank"
    When User logs in with "Invalid@testemail.com" and "123"
    Then User should be displayed with the error message "Error Invalid credentials or access not granted."


  Scenario: As a user, I want to create Digital Bank account

    Given User navigates to Digital Bank signup page
    And Verify that web title is "Digital Bank"
    When User creates account with following fields
      | title | firstName | lastName | gender | dob        | password  | address    | locality | region | postalCode | country | homePhone  | mobilePhone | workPhone  |
      | Mr.   | Jack      | Test     | M      | 12/12/1990 | Tester123 | 12 Main st | City     | CA     | 99921      | US      | 2146591008 | 2136591208  | 1126593008 |
    Then User should be displayed with the message "Registration Successful. Please Login."
