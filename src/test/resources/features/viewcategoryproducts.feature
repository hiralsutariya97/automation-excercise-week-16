Feature: View category products

  Scenario: View category products
    Given The user is on the homepage
    Then Verify that categories are visible on left side bar
    When The user clicks on Women category
    And The user clicks on Dress link under Women category
    Then Verify that category page is displayed and confirm text women Dress PRODUCTS
    When The user clicks on Men category
    And The user clicks on Tshirts link under Men category
    Then Verify that category page is displayed and confirm text men Tshirts PRODUCTS