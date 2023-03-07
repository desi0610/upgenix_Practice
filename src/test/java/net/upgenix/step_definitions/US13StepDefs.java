package net.upgenix.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.upgenix.pages.DiscussPage;
import net.upgenix.pages.LoginPage;
import net.upgenix.utilities.BrowserUtils;
import org.junit.Assert;

public class US13StepDefs {

    LoginPage loginPage = new LoginPage();
    DiscussPage discussPage = new DiscussPage();

    @When("user login using {string} and {string}")
    public void user_login_using_and(String string, String string2) {
       loginPage.login(string,string2);

    }

    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String string) {

        BrowserUtils.sleep(3);

        String actual = discussPage.profileName.getText();
       Assert.assertTrue(discussPage.profileName.getText().equalsIgnoreCase(string) );



    }


}
