Feature: This feature is to test the login functionality

  Developer - Fenton
  Tester - Tatiana
  Reviewed by - Daniel

  Background:
    Given user opens website
    And user is on login page

  @Critical @Fahad
  Scenario: Verify user can login with valid credential
    When user enters username "Admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage

  @Smoke
  Scenario Outline: Verify user can not login with invalid credential
    When user enters username "<username>" and password "<password>"
    And click on login button
    Then verify user is not navigated to homepage

    Examples:
      | username | password   |
      | invalid  | invalid123 |
      | Admin    | invalid123 |
      | invalid  | admin123   |
      |          |            |
      | admin    | Admin123   |

  #To pass data driven parameters we need to use <> and for simple params we need to pass String
  #Valid username: Admin
  #Valid password admin123

  @Regression @Elmaz
  Scenario: Verify user can see error message when enters blank credential
    When user enters username " " and password " "
    And click on login button
    Then verify message 'Invalid username or password.Try again' is displayed

  Scenario: Verify user can login with valid credential and then log out from website
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    When user clicks on user badge icon
    And select logout option
    Then user is on login page
    And user close the browser

  @Smoke @DataTable
  Scenario: Verify user can see web table data
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    Then verify table has below data
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 2008/11/28 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 2009/10/09 |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 2009/01/12 |
      | Bradley Greer      | Software Engineer             | London        | 41 | 2012/10/13 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 2011/06/07 |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 2012/12/02 |
    When user clicks on user badge icon
    And select logout option
    Then user is on login page
    Then verify another table data
      | Airi Satou         |
      | Angelica Ramos     |
      | Ashton Cox         |
      | Bradley Greer      |
      | Brenden Wagner     |
      | Brielle Williamson |


