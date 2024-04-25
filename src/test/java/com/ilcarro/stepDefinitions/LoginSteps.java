package com.ilcarro.stepDefinitions;

import com.iLCarro.pages.HomePage;
import com.iLCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.iLCarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("akuna@matata.com", "Africa2024!");
    }

    @And("User clicks on Yalla button")
    public void click_on_yalla_button() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @And("User verifies Success Message is displayed")
    public void verify_Success_Message() {
        new LoginPage(driver).isMessageDisplayed("Logged in success");
    }
//    @And("User clicks on OK button")
//    public void click_on_OK_button(){
//        new LoginPage(driver).clickOnOKbutton();
//    }
    @And("User enters valid email and invalid password")
    public void  enter_invalid_password(DataTable table){
        new LoginPage(driver).enterInvalidPassword(table);
    }
    @Then("User verifies Error is displayed")
    public void verify_error_message(){
        new LoginPage(driver).isMessageDisplayed("Login or Password incorrect");
    }


}
