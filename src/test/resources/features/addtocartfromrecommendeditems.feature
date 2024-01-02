Feature: Add to cart from recommended items

  Scenario: Add to cart from recommended items
    Given The user is on the homepage
    When The user scrolls down to footer
    Then Verify RECOMMENDED ITEMS are visible
    When The user clicks on Add To Cart on Recommended product
    And The user clicks View Cart button
    Then Verify that recommended product is displayed in cart page