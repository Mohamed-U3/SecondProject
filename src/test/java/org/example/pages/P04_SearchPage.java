package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_SearchPage
{
    public P04_SearchPage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(id = "small-searchterms")
    public WebElement SearchField;

    @FindBy(css = "h2[class='product-title'] a")
    public WebElement ProductTitle;

    @FindBy(css = "div[class='sku'] span[class='value']")
    public WebElement SkuField;
}
