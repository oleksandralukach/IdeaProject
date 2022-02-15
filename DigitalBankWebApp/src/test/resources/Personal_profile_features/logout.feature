Feature: Logout Feature Verification

Background Scenario Outline:
Given user open a website
When user log in with valid credentials "username" and "password"
Then user is on home page
And user should see personal profile icon on right top corner
When user click on personal profile icon
Then user should see dropdown with valid fields

Scenario: verify "Logout" field in personal profile dropdown
Then user should click on third field "Logout"
Then user should be on login page
