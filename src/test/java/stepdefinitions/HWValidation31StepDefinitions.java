package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HWValidationPage;

public class HWValidation31StepDefinitions {

    HWValidationPage hwValidation = new HWValidationPage();

    @When("user enters form firstname {string}")
    public void user_enters_form_firstname(String firstname) {
      hwValidation.firstname.sendKeys(firstname);
    }
    @When("user enters form lastname {string}")
    public void user_enters_form_lastname(String lastname) {
       hwValidation.lastname.sendKeys(lastname);
    }
    @When("user enters form age {string}")
    public void user_enters_form_age(String age) {
        hwValidation.age.sendKeys(age);
    }
    @When("user selects form country {string}")
    public void user_selects_form_country(String country) {
       hwValidation.country.sendKeys(country);
    }
    @When("user enters form notes {string}")
    public void user_enters_form_notes(String notes) {
        hwValidation.notes.sendKeys(notes);
    }
    @When("user clicks on form gonder")
    public void user_clicks_on_form_gonder() {
       hwValidation.gonder.click();
    }
    @When("user validates inputValidate age error message")
    public void user_validates_input_validate_age_error_message() {
      hwValidation.hataAge.isDisplayed();
    }


    @And("user validates inputValidate lastname error message")
    public void userValidatesInputValidateLastnameErrorMessage() {
        hwValidation.hata.isDisplayed();
    }
}
