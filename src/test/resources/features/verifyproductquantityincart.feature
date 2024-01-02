Feature: Verify product quantity in cart

  Scenario: Verify product quantity in cart
    Given The user is on the homepage
    When The user clicks View Product for any product on home page
    Then Verify product detail is opened
    When The user increases quantity to "4"
    And The user clicks Add to cart button
    And The user clicks View Cart button
    Then Verify that product is displayed in cart page with exact quantity