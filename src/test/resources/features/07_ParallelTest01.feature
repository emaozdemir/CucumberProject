@Parallel
Feature: Parallel Test 01

  Scenario: Google Test
    Given  user goes to URL "http://google.com"
    When user prints the title
    Then close parallel driver

  Scenario: Instagram Test
    Given  user goes to URL "http://instagram.com"
    When user prints the title
    Then close parallel driver


  Scenario: Facebook Test
    Given  user goes to URL "http://facebook.com"
    When user prints the title
    Then close parallel driver