Feature: Search product

  Scenario: Search product
    Given The user is on the homepage
    When The user clicks Products menu button
    Then Verify user is navigated to All PRODUCTS page successfully
    When The user enters product name "Blue Top"
    When The user clicks search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible