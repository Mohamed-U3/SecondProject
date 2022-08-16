package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class P06_homeSlidersPage
{
    public P06_homeSlidersPage()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    public static WebElement getSliders(int slide) throws InterruptedException
    {
        if(slide == 1)
        {
            Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();
        }
        else
        {
            Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();
        }
        Thread.sleep(700);
        return Hooks.driver.findElement(By.id("nivo-slider"));
    }
}
