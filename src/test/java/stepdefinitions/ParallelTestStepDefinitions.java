package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ParallelDriver;

public class ParallelTestStepDefinitions {

    @Given("user goes to URL {string}")
    public void userGoesToURL(String url) {
        ParallelDriver.getDriver().get(url);
<<<<<<< HEAD

=======
>>>>>>> 6ec4f47e131e24b3bddb2963a62a913fceafd304
    }

    @When("user prints the title")
    public void user_prints_the_title() {
        System.out.println(ParallelDriver.getDriver().getTitle());
    }

    @Then("close parallel driver")
    public void close_parallel_driver() {
        ParallelDriver.closeDriver();
    }


}
