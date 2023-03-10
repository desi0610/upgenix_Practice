package net.upgenix.step_definitions;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.upgenix.pages.BasePage;
import net.upgenix.pages.LoginPage;
import net.upgenix.utilities.BrowserUtils;
import net.upgenix.utilities.ConfigurationReader;
import net.upgenix.utilities.Driver;
import org.junit.Assert;

import java.util.List;


public class US04StepDefs {

    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    @Then("user should see the below  modules")
    public void user_should_see_the_below_modules(List<String> expectedModules) {
        System.out.println("expectedModules = " + expectedModules);
        //System.out.println("BasePage.listMainModulesTitlesString() = " + BasePage.listMainModulesTitlesString());
        BrowserUtils.sleep(3);
        //List<String> actualSubPages = basePage.mainModules.containsAll(expectedModules);
       // Assert.assertEquals(expectedModules,basePage.mainModules.);
       // Assert.assertTrue(basePage.mainModules.containsAll(expectedModules));
    }

    @Given("user login using \\{string} and \\{string}")
    public void userLoginUsingStringAndString(String str1, String str2) {

        BrowserUtils.sleep(2);
        loginPage.login(str1, str2);
    }


//Assert.assertEquals(expectedModules, BasePage.mainModulesTitles());


}
