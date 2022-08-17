package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P08_WishlistPage
{
    public P08_WishlistPage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement HeartButton;

    @FindBy(id = "bar-notification")
    public WebElement NotificationBar;

    @FindBy(className = "bar-notification")
    public WebElement NotificationBarBackground;

    @FindBy(className = "ico-wishlist")
    public WebElement wishlist;

    @FindBy(className = "qty-input")
    public WebElement quantity;
}
