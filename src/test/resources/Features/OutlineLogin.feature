Feature: login functionality

  Scenario Outline: Check login outline

    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to login page

    Examples:
      | username | password |
      | Raghav   | 12345    |
      | Ele      | 12345    |
