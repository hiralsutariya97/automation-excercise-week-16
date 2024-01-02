Feature: Register User

  Scenario: Register on the weh page
    Given The user is on the homepage
    When The user clicks Signup Login menu button
    Then Verify New User Signup! is visible
    When The user enters name "Hiral"
    When The user enters email "hiralsutariya123@gmail.com"
    And The user clicks Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When User selects Mrs
    When User Enters Password "hiral1234"
    When User Selects Day "6"
    When User Selects Month "July"
    When User Selects Year "2000"
    When User Enters First Name "Hiral"
    When User Enters Last Name "Sutariya"
    When User Enters Address "Coral Street"
    When User Enters Country "India"
    When User Enters State "Mumbai"
    When User Enters City "Bombay"
    When User Enters Zipcode "HA01NP"
    When User Enters Mobile "07424531890"
    And The user clicks Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    When The user clicks Continue button
  #  And The user clicks Dismiss button
    Then Verify that Logged in as username is visible
    When The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks Other Continue button