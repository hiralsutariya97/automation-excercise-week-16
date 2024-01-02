Feature: Logout user

  Scenario: Logout user
    Given The user is on the homepage
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters correct email address "hiralsutariya123@gmail.com"
    When The user enters correct password "hiral123"
    And The user clicks login button
    Then Verify that Logged in as username is visible
    When The user clicks Logout button
    Then Verify New User Signup! is visible