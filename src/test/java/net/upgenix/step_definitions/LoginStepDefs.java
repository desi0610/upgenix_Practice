package net.upgenix.step_definitions;

import net.upgenix.pages.LoginPage;
import net.upgenix.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("POS_Manager")){
            username = ConfigurationReader.getProperty("posmanager6@info.com");
            password = ConfigurationReader.getProperty("posmanager");
        }else if(userType.equalsIgnoreCase("sales_Manager")){
            username = ConfigurationReader.getProperty("salesmanager10@info.com");
            password = ConfigurationReader.getProperty("salesmanager");
        }else if(userType.equalsIgnoreCase("CRM_Manager")){
            username = ConfigurationReader.getProperty("eventscrmmanager10@info.com");
            password = ConfigurationReader.getProperty("eventscrmmanager");
        }else if(userType.equalsIgnoreCase("Inventory_Manager")) {
            username = ConfigurationReader.getProperty("imm10@info.com");
            password = ConfigurationReader.getProperty("inventorymanager");


        }else if(userType.equalsIgnoreCase("Expenses_Manager")) {
            username = ConfigurationReader.getProperty("expensesmanager@info.com");
            password = ConfigurationReader.getProperty("expensesmanager");
        }

            //send username and password and login
       new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }





}
