Feature: Place order register while checkout

  Scenario: Place order register while checkout
    Given The user is on the homepage
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks Cart menu button
    Then Verify that cart page is displayed
    When The user clicks Proceed To Checkout button
    And The user clicks Register-Login button
    And The user enters name "Hiral"
    And The user enters email "hiralsutariya111@gmail.com"
    And The user clicks Signup button
    When User selects Mrs
    When User Enters Password "hiral123"
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
    And Verify that Logged in as username is visible
    When The user clicks Cart menu button
    And The user clicks Proceed To Checkout button
    Then Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    When The user enters description in comment text area "thanks"
    And Click Place Order button
    And The user enters payment details Name on Card "Hiral"
    And The user enters payment details Card Number "4444111122223333"
    And The user enters payment details CVC "232"
    And The user enters payment details Expiration month "12"
    And The user enters payment details Expiration year "2026"
    When The user clicks Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And The user clicks Delete Account button
    Then Verify that ACCOUNT DELETED is visible
    And The user clicks Other Continue button
