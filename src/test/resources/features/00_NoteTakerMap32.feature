@HW32
Feature: Data Table Test

  @NoteTakerMap
  Scenario: Simple Note Taker Map
    Given user goes to url "https://testpages.eviltester.com/styled/apps/notes/simplenotes.html"
    When user enters title and note
      | Selenium | Hello John   |
      | TestNG   | Hi, everyone |
      | TestPOM  | Goodbye      |
      | Java     | Merhaba!!!   |
      | HTML/CSS | Merhaba!!!   |
      | SDLC     | Merhaba!!!   |
    And user clicks on form add
    Then user closes the browser