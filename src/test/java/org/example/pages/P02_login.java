package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login
{
    public P02_login()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-login")
    public WebElement LoginBtn;

    @FindBy(id = "Email")
    public WebElement EmailTextField;

    @FindBy(id = "Password")
    public WebElement passwordTextField;

    @FindBy(css = "button[class ='button-1 login-button']")
    public WebElement LoginBtn2;

    @FindBy(className = "ico-account")
    public WebElement MyAccount;

    @FindBy(css = "div[class ='message-error validation-summary-errors']")
    public WebElement ErrorMassage;
}
