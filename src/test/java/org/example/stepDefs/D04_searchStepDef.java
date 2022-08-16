package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P04_SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef
{
    P04_SearchPage page = new P04_SearchPage();

    @Given("user Click on Search Text Field")
    public void Search_Field()
    {
        page.SearchField.click();
    }
    @When("^I enter Product Name as \"(.*)\"$")
    public void Search_On_Product(String Product)
    {
        page.SearchField.sendKeys(Product);
        page.SearchField.submit();
    }

    @Then("assert the URL of the Search Page")
    public void Assert_URL_Page()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="),
                "###Error Message: The page has been reached is not the correct URL >>");
        soft.assertAll();
    }

    @And("the Count of the Product shell be Found")
    public void Count_Of_Product()
    {
        List<WebElement> listOfItems = Hooks.driver.findElements(By.cssSelector("div[class='product-item']"));
        System.out.println("################################################");
        System.out.println("The count of Product = " + listOfItems.size());
    }

    @And("^The Product Shell have keyword as \"(.*)\"$")
    public void keyword_verification_Of_Product(String Product)
    {
        SoftAssert soft = new SoftAssert();
        List<WebElement> listOfItems = Hooks.driver.findElements(By.cssSelector("h2[class='product-title']"));
        for(WebElement listOfItem:listOfItems)
        {
            soft.assertTrue(listOfItem.getText().toLowerCase().contains(Product),
                    "###Error Message: The product found does not have Keyword user Searched for >>");
        }
        soft.assertAll();
    }

    @And("Navigate one of the products")
    public void Navigate_products()
    {
        page.ProductTitle.click();
    }

    @And("^Find the SKU in Page and Find it as \"(.*)\"$")
    public void Assert_Product_SKU(String Product)
    {
        Assert.assertTrue(page.SkuField.getText().contains(Product),"###Error Message: The SKU Not found in the page >>");
    }
}
