Feature: Verify scroll up using arrow button and scroll down functionality

  Scenario:  Verify scroll up using arrow button and scroll down functionality
    Given The user is on the homepage
    When The user scrolls down to footer
    Then Verify text SUBSCRIPTION
    When Ths user clicks orange arrow button
    Then Verify that page is scrolled up and Full-Flegged practice website for Automation Engineers text is visible on screen
