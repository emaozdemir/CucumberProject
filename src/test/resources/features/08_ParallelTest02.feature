@Parallel
Feature: Parallel Test 02

  Scenario: LinkedIn Test
    Given user goes to URL "http://linkedin.com"
    When user prints the title
    Then close parallel driver


