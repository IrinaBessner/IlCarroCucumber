package com.iLCarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCarPage extends BasePage {

    public AddCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement cityInput;
    public AddCarPage enterLocation(String city) {
        type(cityInput, city);
        pause(1000);
        cityInput.sendKeys(Keys.DOWN);
        cityInput.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement enterMake;

    public AddCarPage enterMake(String make) {
        type(enterMake, make);
        return this;
    }
    @FindBy(id = "model")
    WebElement enterModel;

    public AddCarPage enterModel(String model) {
        type(enterModel, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement enterYear;

    public AddCarPage enterYear(String year) {
        type(enterYear, year);
        return this;
    }


    @FindBy(id = "fuel")
    WebElement enterFuel;

    public AddCarPage selectsFuel(String gas) {
        Select select = new Select(enterFuel);
        select.selectByVisibleText(gas);
        return this;
    }

    @FindBy(id = "seats")
    WebElement enterSeat;

    public AddCarPage enterNumberSeat(String seat) {
        type(enterSeat, seat);
        return this;
    }

    @FindBy(id = "class")
    WebElement enterClass;

    public AddCarPage enterCarClass(String carClass) {
        type(enterClass, carClass);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement enterRegistrNumber;

    public AddCarPage enterRegistrationNumber(String number) {
        type(enterRegistrNumber, number);
        return this;
    }

    @FindBy(xpath = "//input[@id='price']")
    WebElement entPrice;

    public AddCarPage enterPrice(String price) {
        type(entPrice, price);
        return this;
    }

    @FindBy(id = "about")
    WebElement aboutText;

    public AddCarPage enterAbout(String text) {
        type(aboutText, text);
        return this;
    }

    @FindBy(xpath ="//input[@id='photos']")
    WebElement loadPhoto;

    public AddCarPage uploadPhoto(String photo) {
        loadPhoto.sendKeys(photo);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submit;

    public AddCarPage clickOnSubmitButton() {
        click(submit);
        return this;
    }

    @FindBy(xpath = "//h1[.='Car added']")
    WebElement submitMessage;

    public AddCarPage submitMessageCarSuccessAdded(String message) {
        assert submitMessage.getText().contains(message);
        return this;
    }
}
