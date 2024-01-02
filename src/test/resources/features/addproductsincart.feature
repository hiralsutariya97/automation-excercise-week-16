Feature: Add products in cart

  Scenario: Add products in cart
    Given The user is on the homepage
    When The user clicks Products menu button
    And The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user hovers over second product and clicks Add to cart
    And The user clicks View Cart button
    Then Verify both products are added to Cart
    And Verify their prices
    And Verify their quantity
    And Verify their total price