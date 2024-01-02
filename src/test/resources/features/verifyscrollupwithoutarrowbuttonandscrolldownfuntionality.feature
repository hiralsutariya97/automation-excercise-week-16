Feature: Verify scroll up without arrow button and scroll down functionality

  Scenario: Verify scroll up without arrow button and scroll down functionality
    Given The user is on the homepage
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When The user scrolls up to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen