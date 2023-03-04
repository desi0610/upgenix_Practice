package net.upgenix.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class BasePage {

    //US1
    @FindBy(xpath = "//span[normalize-space()='Sales']")
    public WebElement SalesPage;


    //US2  , US11
    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement RepairsPage;

    //US3 , US4 , US7 ,US8 , US9
    @FindBy(xpath = "(//div[@class='navbar-collapse collapse']//ul)[1]")
    //div[@class='navbar-collapse collapse']
    public List<WebElement> mainModules;
    // optional for user story 4 or 3 or 7  or 8 or 9://span[@class='oe_topbar_name']

    //US5
    @FindBy(xpath = "(//span[normalize-space()='Point of Sale'])[1]")
    public WebElement pointOfSalesPage;
    @FindBy(xpath = "(//span[normalize-space()='Orders'])[3]")
    public WebElement OrdersButton;
    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement orderRefCheckBox;
    @FindBy(xpath = "//button[normalize-space()='Action']")
    public WebElement actionButton;

    //U6
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement profileButton;
    @FindBy(xpath = "//a[.='Documentation']")
    public WebElement docPage;
    @FindBy(xpath = "//h1[@class='text-white']")
    public WebElement odooDoc;

    //section[@class='o_content_fw_banner']/following-sibling::* select all the topic
    @FindBy(xpath = "(//a[.='User Docs'])[2]")
    public WebElement userDocTopic;
    @FindBy(xpath = "(//a[.='Install and Maintain'])[2]")
    public WebElement installAndMaintainTopic;
    @FindBy(xpath = "(//a[.='Developer'])[2]")
    public WebElement developerTopic;
    @FindBy(xpath = "(//a[.='Contributing'])[2]")
    public WebElement contributingTopic;

    //US10
    @FindBy(xpath = "(//span[normalize-space()='Quotations'])[2]")
    public WebElement quotationsButton;
    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement quotationsBox;

    //US11
    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement repairsBox;

    //US14
    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement calenderPage;
    //example we want to choose time 0:00 ==>((//tbody)[5]/tr/td/span)[1]
    @FindBy(xpath = "(//tbody)[5]/tr/td/span")
    public List<WebElement> timeList;


}