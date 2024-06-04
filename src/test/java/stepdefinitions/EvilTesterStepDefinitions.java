package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CLHomePage;
import pages.EvilTesterHomePage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class EvilTesterStepDefinitions {

    EvilTesterHomePage etHomePage = new EvilTesterHomePage ();

    @When("user enters form username {string}")
    public void user_enters_form_username(String username) {
        etHomePage.username.sendKeys(username);
    }
    @When("user enters form password {string}")
    public void user_enters_form_password(String password) {
       etHomePage.password.sendKeys(password);
    }
    @When("user enters form comment {string}")
    public void user_enters_form_comment(String comments) {
        etHomePage.comments.clear();
        etHomePage.comments.sendKeys(comments);;
    }
    @When("user clicks on form submit")
    public void user_clicks_on_form_submit() {
        etHomePage.submitbutton.click();
    }

}