Feature: Login
  User can login with valid data

  Background:
    Given user open the browser
    And user open login page

  @PositiveCase
  Scenario Outline: User input valid data in the login page
    When user fill the <username> and <password>
    And  user click login button
    Then user success to login
    Examples:
      | username | password |
      | Tester01 | 12345    |

