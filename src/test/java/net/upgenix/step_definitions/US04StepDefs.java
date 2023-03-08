package net.upgenix.step_definitions;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.upgenix.pages.BasePage;
import net.upgenix.pages.DiscussPage;
import net.upgenix.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;


public class US04StepDefs {

    BasePage basePage = new BasePage();


    @Then("user should see the below {int} modules")
    public void user_should_see_the_below_modules(int expectedModules) {

        Assert.assertEquals(expectedModules, BasePage.mainModulesTitles());
    }



}
