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
    And user closes the browser
    Examples:
      | firstname | lastname | age | country | notes          |
      | john      | doedoedoee   | 25  | Mali    | umarim calisir |
      | john      | doedoedoee   | 25  | Mali    | umarim calisir |
      | john      | doedoedoee   | 25  | Mali    | umarim calisir |
      | john      | doedoedoee   | 25  | Mali    | umarim calisir |



