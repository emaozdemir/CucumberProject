Feature: Excel Automatic

  Scenario:Data table test
    Given user goes to url "https://editor.datatables.net"
    When user enters credentials from "" sheet ""
    Then user closes the browser
