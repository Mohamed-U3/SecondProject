package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P06_homeSlidersPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef
{
    P06_homeSlidersPage page = new P06_homeSlidersPage();

    @Given("the main page first slider and click on it")
    public void first_slider() throws InterruptedException
    {
        Thread.sleep(2000);
        page.getSliders(1).click();
    }

    @Then("Assert The URL of first slider page")
    public void Assert_URL_first_slider() throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"),
                "###Error Message: the URL is not correct ");
    }

    @Given("the main page Second slider and click on it")
    public void Second_slider() throws InterruptedException
    {
        Thread.sleep(2000);
        page.getSliders(2).click();
    }

    @Then("Assert The URL of second slider page")
    public void Assert_URL_second_slider() throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"),
                "###Error Message: the URL is not correct ");
    }
}
