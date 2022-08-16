package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P07_followUsPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef
{
    P07_followUsPage page = new P07_followUsPage();

    @Given("user opens facebook link")
    public void open_FB()
    {
        page.fb_page.click();
        ArrayList<String> tabs = new ArrayList<> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }
    @Then("assert that Facebook link is open")
    public void Assert_FB()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
    }

    @Given("user opens twitter link")
    public void open_twitter()
    {
        page.twitter_page.click();
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }
    @Then("assert that twitter link is open")
    public void Assert_twitter()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
    }

    @Given("user opens rss link")
    public void open_rss() throws InterruptedException
    {
        Actions action=new Actions(Hooks.driver);
        action.keyDown(Keys.CONTROL).build().perform();
        page.rss_page.click();
        action.keyUp(Keys.CONTROL).build().perform();
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }
    @Then("assert that rss link is open")
    public void Assert_rss()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
    }

    @Given("user opens youtube link")
    public void open_youtube()
    {
        page.youtube_page.click();
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }
    @Then("assert that youtube link is open")
    public void Assert_youtube()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
    }
}
