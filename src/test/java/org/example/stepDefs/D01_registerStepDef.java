package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class D01_registerStepDef
{
    @Given("user go to register page")
    public void register_page()
    {
        Hooks.driver.findElement(By.className("ico-register")).click();
    }
}
