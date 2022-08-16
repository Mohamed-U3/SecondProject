package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P05_HoverMainPage
{
    public P05_HoverMainPage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    public static List<WebElement> ListOfTopMenu = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a"));

    public static List<WebElement> ListOfSubMenu(int selectedCategory)
    {
        return Hooks.driver.findElements(By.xpath("(//ul[@class='top-menu notmobile']//ul)["+(selectedCategory+1)+"]/li"));
    }

    @FindBy(css = "div[class=\"page-title\"] h1")
    public WebElement pageTitle;
}
