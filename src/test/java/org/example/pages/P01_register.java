package org.example.pages;

import org.example.stepDefs.Hooks;
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
}
