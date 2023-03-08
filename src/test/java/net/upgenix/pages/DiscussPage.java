package net.upgenix.pages;

import net.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage extends BasePage {

    public DiscussPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement profileName;

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[22]")//from 1 to 22
    public WebElement modules22;

    //span[normalize-space()='Discuss'] // to maybe create a dynamic locator
}
