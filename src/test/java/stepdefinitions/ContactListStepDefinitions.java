package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class ContactListStepDefinitions {

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("contact_list_url"));
    }

    @When("user enters email")
    public void user_enters_email() {

    }

    @When("user enters password")
    public void user_enters_password() {

    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {

    }

    @Then("user validates sign in")
    public void user_validates_sign_in() {

    }

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

}
