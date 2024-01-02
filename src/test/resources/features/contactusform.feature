Feature: Contact us form

  Scenario: Contact us form
    Given The user is on the homepage
    When The user clicks Contact us menu button
    Then Verify Get IN TOUCH is visible
    When The user enters name "Hiral"
    When The user enters contact email "hiralsutariya123@gmail.com"
    When The user enters subject "subject"
    When The user enters message "message"
    And The user uploads file
    And The user clicks Submit button
    And The user clicks OK button
    Then Verify success message Success Your details have been submitted successfully is visible
    When The user clicks Home button
    Then Verify that landed to homepage successfully