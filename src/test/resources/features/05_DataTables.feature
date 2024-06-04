@DataTable
Feature: Data Table Test

  Scenario: Todo list
    Given user goes to url "https://webdriveruniversity.com/To-Do-List/index.html"
    When user enters todos
      | Prepare breakfast        |
      | Wash the dishes          |
      | Take care of baby        |
      | Help your kid's homework |
      | Study Selenium           |
      | Sleep                    |
      | Get up                   |
      | Go to school                   |
    Then user closes the browser
