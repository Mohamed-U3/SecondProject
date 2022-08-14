package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class D03_currenciesStepDef
{
    P03_homePage page = new P03_homePage();

    @When("User login User choose Euro as currency")
    public void Euro_Currency()
    {
        page.customerCurrency.click();
        new Select(page.customerCurrency).selectByVisibleText("Euro");
    }

    @Then("assert if the 4 product in same page is now in Euro")
    public void Currency_Assertion()
    {
        List<WebElement> listofItems = Hooks.driver.findElements(By.cssSelector("span[class='price actual-price']"));
        for(int i = 0 ;i <  listofItems.size() ;i++)
        {
            System.out.println("###############################################");
            System.out.println(listofItems.get(i).getText());
            Assert.assertTrue(listofItems.get(i).getText().contains("€"),"Error Message: The Item is not in Euro >>");
        }
    }
}
