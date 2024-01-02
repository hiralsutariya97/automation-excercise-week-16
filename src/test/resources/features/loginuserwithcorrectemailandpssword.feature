Feature: Login User with correct email and password

  Scenario: Login User with correct email and password
    Given The user is on the homepage
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters correct email address "hiralsutariya123@gmail.com"
    When The user enters correct password "hiral1234"
    And The user clicks Signup Login button
    Then Verify that Logged in as username is visible
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks Other Continue button