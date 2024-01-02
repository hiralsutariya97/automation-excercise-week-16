Feature: Add review on product

  Scenario: Add review on product
    Given The user is on the homepage
    When The user clicks Products menu button
    Then Verify user is navigated to All PRODUCTS page successfully
    When The user clicks View Product for any product on home page
    Then Verify Write Your Review is visible
    And The user fills in name "Hiral"
    And The user fills in email "hiralsutariya34@gmail.com"
    And The user fills in review "test"
    And The click Submit Button
    Then Verify success message Thank you for your review.