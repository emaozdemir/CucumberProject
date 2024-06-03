@Login
Feature: Login Test

  @PositiveLogin
  Scenario: Positive Login Test
    Given user goes to homepage
    When user enters email
    And user enters password
    And user clicks on submit button
    Then user validates sign in
    And user closes the browser