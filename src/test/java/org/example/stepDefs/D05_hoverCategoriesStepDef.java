package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_HoverMainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef
{
    P05_HoverMainPage page = new P05_HoverMainPage();
    String selectedSubCategoryText;
    String pageTitleText;


    @When("user hover on one of the main categories Click on it and get the Text")
    public void one()
    {
        Actions actions=new Actions(Hooks.driver);
        int count = page.ListOfTopMenu.size();
        System.out.println("count is "+count);
        int min = 0;
        int max = count-1;
        int selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
        actions.moveToElement(page.ListOfTopMenu.get(selectedCategory)).perform();
        String selectedCategoryText = page.ListOfTopMenu.get(selectedCategory).getText();
        System.out.println("to know which category is selected:   " +selectedCategoryText);

        List<WebElement> subCategoryLinks = page.ListOfSubMenu(selectedCategory);

        // minimize implicit wait to not waste time if it's empty
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        if(!subCategoryLinks.isEmpty()) {
            int subCategoryCount = subCategoryLinks.size();
            System.out.println("Sub-Categories Count: " + subCategoryCount);
            System.out.println(subCategoryLinks.get(0).getText());
            System.out.println(subCategoryLinks.get(1).getText());
            System.out.println(subCategoryLinks.get(2).getText());
            max = subCategoryCount-1;
            int selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText();
            subCategoryLinks.get(selectedSubCategory).click();
            System.out.println("selected Sub-Category Text: " + selectedSubCategoryText);
            // Do your assertion on selected sub category
        }
        else
        {
            page.ListOfTopMenu.get(selectedCategory).click();
            selectedSubCategoryText = selectedCategoryText;
            // Do your assertion on selected main category
        }

        // reset it to the initial value
        Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @And("get text of the page title")
    public void two()
    {
        pageTitleText = page.pageTitle.getText();
    }

    @Then("assert that the page title is the same as the text of sub-category selected")
    public void three()
    {
        Assert.assertTrue(selectedSubCategoryText.toLowerCase().contains(pageTitleText.toLowerCase()));
        System.out.println("Assertion Done");
    }
}
