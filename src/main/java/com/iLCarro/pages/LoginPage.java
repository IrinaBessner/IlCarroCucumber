package com.iLCarro.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;

    public LoginPage enterData(String email, String password) {
        type(emailInput, email);
        type(passwordInput, password);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;

    public LoginPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(css = ".dialog-container")
    WebElement message;
    public LoginPage isMessageDisplayed(String text) {
        assert message.getText().contains(text);
        return this;
    }
//    @FindBy(css = "[type='button']")
//    WebElement ok;
//    public LoginPage clickOnOKbutton() {
//        click(ok);
//        return this;
//    }


    public LoginPage enterInvalidPassword(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");
        enterData(email, password);

        return this;
    }


}
