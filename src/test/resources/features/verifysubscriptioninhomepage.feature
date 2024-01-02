Feature: Verify subscription in home page

  @register
  Scenario: Verify subscription in home page
    Given The user is on the homepage
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user enters email address "hiralsutariya12@gmail.com"
    When The user clicks Subscription submit button
    Then Verify success message You have been successfully subscribed is visible