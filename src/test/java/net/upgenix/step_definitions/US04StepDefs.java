package net.upgenix.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.upgenix.pages.DiscussPage;
import net.upgenix.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;

public class US04StepDefs {

    DiscussPage discussPage = new DiscussPage();

    @Given("user logged is as {string} and {string}")
    public void user_logged_is_as_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should see the below modules")
    public void user_should_see_the_below_modules() {

    }

}
