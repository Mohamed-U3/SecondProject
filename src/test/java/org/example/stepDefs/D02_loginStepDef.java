package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef
{
    P02_login page = new P02_login();

    @Given("user go to login page")
    public void Navi_login_page()
    {
        page.LoginBtn.click();
    }

    @When("^user login with \"(.*)\" and \"(.*)\"$")
    public void Login_with(String UserEmail,String Password)
    {
        page.EmailTextField.sendKeys(UserEmail);
        page.passwordTextField.sendKeys(Password);
    }

    @And("user press on login button")
    public void Press_loginBtn()
    {
        page.LoginBtn2.click();
    }

    @Then("user login to the system successfully")
    public void Assert_Login_Successful()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/",
                "###Error Massage : The URL After login is not correct >> ");
        soft.assertEquals(page.MyAccount.getText(),"My account",
                "###Error Massage : My Account Text in not Found >>");
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void Assert_Login_Fail()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(page.ErrorMassage.getText().contains("Login was unsuccessful.")
                ,"###Error Massage : The Error Massage of unsuccessful Login is not Found >>");
        soft.assertEquals(Color.fromString(page.ErrorMassage.getCssValue("color")).asHex(),"#e4434b",
                "###Error Massage : The Color of Text Is not Correct >>");
        soft.assertAll();
    }
}
