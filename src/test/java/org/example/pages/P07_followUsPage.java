package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_followUsPage
{
    public P07_followUsPage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "facebook")
    public WebElement fb_page;

    @FindBy(className = "twitter")
    public WebElement twitter_page;

    @FindBy(className = "rss")
    public WebElement rss_page;

    @FindBy(className = "youtube")
    public WebElement youtube_page;
}
