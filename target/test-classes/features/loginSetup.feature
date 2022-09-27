Feature: Login Setup

  Background:
    Given user open login page setup

  Scenario: Login with setup
    When user enter the email and password
    And  user click button login
    Then user success to login with setup