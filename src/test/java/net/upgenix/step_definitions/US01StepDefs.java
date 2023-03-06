package net.upgenix.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.upgenix.pages.SalesPage;
import net.upgenix.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;


public class US01StepDefs {

    SalesPage salesPage = new SalesPage();


    @When("user clicks on the Sales page")
    public void user_clicks_on_the_sales_page() {

        BrowserUtils.sleep(2);
        salesPage.SalesPage.click();
    }


    @Then("user should see these six columns with expected text")
    public void userShouldSeeTheseSixColumnsWithExpectedText() {



    }
}
