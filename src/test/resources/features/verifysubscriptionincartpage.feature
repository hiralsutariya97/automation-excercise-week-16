Feature: Verify subscription in cart page

  Scenario:  Verify subscription in cart page
    Given The user is on the homepage
    When The user clicks Cart menu button
    And The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user enters email address "hiralsutariya11@gmail.com"
    When The user clicks Subscription submit button
    Then Verify success message You have been successfully subscribed is visible