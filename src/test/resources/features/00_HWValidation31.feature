@Validation
Feature:Scenario Outline Form Feature

  Background: User goes to url
    Given user goes to url "https://testpages.eviltester.com/styled/validation/input-validation.html"

  @PositiveTests
  Scenario Outline: PositiveTests
    When user enters form firstname "<firstname>"
    And user enters form lastname "<lastname>"
    And user enters form age "<age>"
    And user selects form country "<country>"
    And user enters form notes "<notes>"
    And user clicks on form gonder
    Then user closes the browser
    Examples:
      | firstname  | lastname     | age | country     | notes           |
      | John John  | van der Rijn | 25  | Netherlands | Hello everyone! |
      | John  John | van der Rijn | 25  | Netherlands | Hello everyone! |



  @NegativeTests
  Scenario Outline: Short lastname
    When user enters form firstname "<firstname>"
    And user enters form lastname "<lastname>"
    And user enters form age "<age>"
    And user selects form country "<country>"
    And user enters form notes "<notes>"
    And user clicks on form gonder
    And user validates inputValidate lastname error message
    Then user closes the browser
    Examples:
      | firstname   | lastname | age | country | notes        |
      | Abdurrahman | D        | 22  | Mali    | Hello world! |
      | Abdurrahman | D        | 22  | Mali    | Hello world! |



  @NegativeTests
  Scenario Outline: Empty Age Field
    When user enters form firstname "<firstname>"
    And user enters form lastname "<lastname>"
    And user enters form age "<age>"
    And user selects form country "<country>"
    And user enters form notes "<notes>"
    And user clicks on form gonder
    And user validates inputValidate age error message
    Then user closes the browser
    Examples:
      | firstname   | lastname   | age | country | notes        |
      | Abdurrahman | Delidumrul |     | Mali    | Hello world! |
      | Abdurrahman | Delidumrul |     | Mali    | Hello world! |
