package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register
{
    public P01_register()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerBtn;

    @FindBy(id = "gender-male")
    public WebElement MaleGender;

    @FindBy(id = "FirstName")
    public WebElement FirstNameField;

    @FindBy(id = "LastName")
    public WebElement LastNameField;

    @FindBy(id = "Email")
    public WebElement EmailField;

    @FindBy(id = "Password")
    public WebElement PasswordField;

    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPasswordField;

    @FindBy(id = "register-button")
    public WebElement registrationBtn;

    @FindBy(className = "result")
    public WebElement ResultText;

    @FindBy(name = "DateOfBirthDay")
    public WebElement DateOfBirthDay;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement DateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement DateOfBirthYear;
}
