package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef
{
    P01_register page = new P01_register();

    @Given("user go to register page")
    public void Register_page()
    {
        page.registerBtn.click();
    }

    @And("user select gender type")
    public void GenderSelect()
    {
        page.MaleGender.click();
    }

    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void FirstandLastName(String Fname, String Lname)
    {
        page.FirstNameField.sendKeys(Fname);
        page.LastNameField.sendKeys(Lname);
    }

    @And("user enter date of birth")
    public void DateOfBirth()
    {
        page.DateOfBirthDay.click();
        new Select(page.DateOfBirthDay).selectByValue("22");

        page.DateOfBirthMonth.click();
        new Select(page.DateOfBirthMonth).selectByVisibleText("February");

        page.DateOfBirthYear.click();
        new Select(page.DateOfBirthYear).selectByValue("1998");
    }

    @And("^user enter email \"(.*)\" field$")
    public void EmailEnter(String email)
    {
        page.EmailField.sendKeys(email);
    }

    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void PasswordEnter(String pass,String Vpass)
    {
        page.PasswordField.sendKeys(pass);
        page.ConfirmPasswordField.sendKeys(Vpass);
    }

    @And("user clicks on register button")
    public void RegisterationBtn()
    {
        page.registrationBtn.click();
    }

    @Then("success message is displayed")
    public void Registeration_Success_Message_Assertion()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(page.ResultText.getText(),"Your registration completed",
                "The Registration Fail To Finish Correctly");
        soft.assertAll();
    }
}
