package com.ilcarro.stepDefinitions;

import com.iLCarro.pages.AddCarPage;
import com.iLCarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import com.iLCarro.pages.LoginPage;
import com.iLCarro.pages.BasePage;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;

import static com.iLCarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on the Let the car work")
    public void click_On_Let_Car_Work() {
        new HomePage(driver).clickOnLetCarWork();
    }

    @And("User enters Location")
    public void enter_Location() {
        new AddCarPage(driver).enterLocation("Haifa");
    }
    @And("User enter a make")
    public void enter_make(){
        new AddCarPage(driver).enterMake("Volvo");
    }

    @And("User enter a model")
    public void enter_model()  {
        new AddCarPage(driver).enterModel("X60");
    }

    @And("User enter year")
    public void enter_year(){
        new AddCarPage(driver).enterYear("2024");
    }

    @And("User selects fuel")
    public void select_fuel(){
        new AddCarPage(driver).selectsFuel("Gas");
    }

    @And("User enter number if seats")
    public void enter_number_seat(){
        new AddCarPage(driver).enterNumberSeat("3");
    }

    @And("User enter car class")
    public void enter_car_class(){
        new AddCarPage(driver).enterCarClass("A");
    }

    @And("User enter registration number")
    public void enter_registration_number(){
        new AddCarPage(driver).enterRegistrationNumber("555-666-777");
    }

    @And("User enter price")
    public void enter_price(){
        new AddCarPage(driver).enterPrice("150");
    }

    @And("User enters About")
  public void enter_About(){
      new AddCarPage(driver).enterAbout("Car is old");
    }
    @And("User enters Photos car")
  public void enter_Photos_Car(){
      new AddCarPage(driver).uploadPhoto("C:/Tools/1.jpg");
    }
  @And("User clicks on Submit button")
  public void click_On_Submit_Button(){
      new AddCarPage(driver).clickOnSubmitButton();
  }
  @Then("User verifies Success message is displayed")
  public void verify_Success_Message() {
    new AddCarPage(driver).submitMessageCarSuccessAdded("");
  }
}
