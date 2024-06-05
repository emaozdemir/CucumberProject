@Validation
Feature: Form Test Feature

  Scenario Outline: Form Validation Test
    Given user goes to url "https://testpages.eviltester.com/styled/validation/input-validation.html"
    When user enters form firstname "<firstname>"
    And user enters form lastname "<lastname>"
    And user enters form age "<age>"
    And user selects form country "<country>"
    And user enters form notes "<notes>"
    And user clicks on form gonder
    Examples:
      | firstname | lastname | age | country | notes          |
      | john      | doedoe   | 25  | Mali    | umarim calisir |
      | john      | doedoe   | 25  | Haiti   | umarim calisir |
      | john      | doedoe   | 25  | Bolivia | umarim calisir |
      | john      | doedoe   | 25  | Cuba    | umarim calisir |


