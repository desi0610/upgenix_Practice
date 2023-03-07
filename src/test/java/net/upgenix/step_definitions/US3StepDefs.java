package net.upgenix.step_definitions;


import io.cucumber.java.en.Then;
import net.upgenix.pages.DiscussPage;
import net.upgenix.utilities.BrowserUtils;
import org.junit.Assert;

import java.util.List;


public class US3StepDefs {

   DiscussPage discussPage = new DiscussPage();

//   @Then("user should see the main modules")
//   public void user_should_see_the_main_modules(List<String> expectedPagesText) {
//
//        List<String> actualText = BrowserUtils.getElementsText(discussPage.mainModules);
//
//        Assert.assertEquals(expectedPagesText, actualText);
//
//   }
@Then("user should see these menus options")
public void user_should_see_these_menus_options() {



}

}
