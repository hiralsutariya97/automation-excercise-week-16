Feature: Login user with incorrect email and password

  Scenario: Login user with incorrect email and password
    Given The user is on the homepage
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters correct email address "hiralsutariya@gmail.com"
    When The user enters correct password "hiral12345"
    And The user clicks login button
    Then Verify error Your email or password is incorrect is visible