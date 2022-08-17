package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_WishlistPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef
{
    P08_WishlistPage page = new P08_WishlistPage();

    @When("user clicks on heart button")
    public void Heart_button()
    {
        page.HeartButton.click();
    }

    @Then("assert that message appears with green background")
    public void Assert_Heart_button()
    {
        SoftAssert soft = new SoftAssert();
        //The product has been added to your wishlist
        while (!page.NotificationBar.isDisplayed())
        {
            soft.assertTrue(page.NotificationBarBackground.getText().contains("The product has been added to your wishlist"),
                    "###Error Message: success message is not correct");

            soft.assertEquals(Color.fromString(page.NotificationBarBackground.getCssValue(
                    "background-color")).asHex(),"#4bb07a",
                    "###Error Message: Notification Bar Background color is not correct");
        }
        soft.assertAll();
    }

    @And("user clicks on wishlist on the top")
    public void Wishlist_button()
    {
        page.wishlist.click();
    }

    @Then("assert that the qty value is bigger than 0")
    public void Assert_Qty()
    {
        SoftAssert soft = new SoftAssert();

        int value = Integer.parseInt(page.quantity.getAttribute("value"));
        soft.assertTrue(value > 0);

        soft.assertAll();
    }
}
