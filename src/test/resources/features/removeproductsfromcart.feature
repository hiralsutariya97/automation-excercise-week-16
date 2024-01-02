Feature: Remove products from cart

  Scenario: Remove products from cart
    Given The user is on the homepage
    When The user hovers over first product and clicks Add to cart
    And The user clicks Continue Shopping button
    And The user clicks Cart menu button
    Then Verify that cart page is displayed
    When The user clicks X button corresponding to particular product
    Then Verify that product is removed from the cart