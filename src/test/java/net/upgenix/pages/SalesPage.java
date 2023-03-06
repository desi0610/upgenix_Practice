package net.upgenix.pages;

import net.upgenix.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage extends BasePage {

    public SalesPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//thead/tr/th[@class='o_column_sortable']")
    public List<WebElement> columns6_SalesPage;


}
