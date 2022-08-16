package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Hooks
{
    public static WebDriver driver = null;
    
    @Before
    public static void BrowserInit()
    {
        //1- Set System Properties
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //2- create new object from Webdrive
        driver = new ChromeDriver();

        //3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4- Navigate to URL
        driver.navigate().to("https://demo.nopcommerce.com");
    }

    @After
    public static void BrowserQuit()
    {
        try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
        driver.quit();
    }
}
