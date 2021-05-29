package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.DrivePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Locale;

public class DriveStepDefs  {

DrivePage drivePage=new DrivePage();

    @Given("the user logs in as {string}")
    public void the_user_logs_in_as(String user) {
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys(ConfigurationReader.get(user+"_username"));
        loginPage.password.sendKeys(ConfigurationReader.get(user+"_password"));
        loginPage.logIn.click();
    }

    @Given("the user navigates to {string} page")
    public void the_user_navigates_to_page(String tab) {

       // drivePage.driveTab.click();
        drivePage.navigateToMenu(tab);

    }
    @When("the user clicks {string}")
    public void the_user_clicks(String drive) {
        switch (drive.toLowerCase(Locale.ROOT)){
            case "my drive":
                drivePage.myDrive.click();
                break;
            case "company drive":
                drivePage.companyDrive.click();
                break;
            default:
                System.out.println("no such drive exists");

        }

    }
    @Then("the user can display {string} window")
    public void the_user_can_display_window(String drive) {
//        BrowserUtils.waitFor(5);
       Assert.assertTrue(Driver.get().getTitle().toLowerCase().contains(") "+drive.toLowerCase()));
    }
}
