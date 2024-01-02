Feature: Register user with existing email

  Scenario: Register user with existing email
    Given The user is on the homepage
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters existing name "Hiral"
    When The user enters existing email "hiralsutariya123@gmail.com"
    And The user clicks Signup button
    Then Verify error Email Address already exist is visible