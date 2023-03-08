package net.upgenix.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.upgenix.pages.RepairsPage;
import net.upgenix.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;

public class US02StepDefs {

    RepairsPage repairsPage = new RepairsPage();

    @And("user clicks on the Repairs page")
    public void userClicksOnTheRepairsPage() {

      //  repairsPage.RepairsPage.click();
    }

    @Then("user should see these six columns with text")
    public void userShouldSeeTheseSixColumnsWithText(List<String> expectedText) {
        List<String> actualColumnsText = BrowserUtils.getElementsText(repairsPage.columnsInRepairs);

        Assert.assertEquals(expectedText, actualColumnsText);
    }

}

