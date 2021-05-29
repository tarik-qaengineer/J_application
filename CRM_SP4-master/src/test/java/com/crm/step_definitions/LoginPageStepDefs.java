package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageStepDefs {

    @Given("the user logged in as {string}")
    public void theUserLoggedInAsString(String userType) {

        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equals("HR")){
            username = ConfigurationReader.get("HR_username");
            password = ConfigurationReader.get("HR_password");
        }else if(userType.equals("Helpdesk")){
            username = ConfigurationReader.get("Helpdesk_username");
            password = ConfigurationReader.get("Helpdesk_password");
        }else if(userType.equals("Marketing")){
            username = ConfigurationReader.get("Marketing_username");
            password = ConfigurationReader.get("Marketing_password");
        }


        BrowserUtils.waitFor(1);
        //send username and password and login
        new LoginPage().login(username,password);

        System.out.println("When usertype is "+userType+" then PageTitle  = " + Driver.get().getTitle());

        Assert.assertTrue(Driver.get().getTitle().contains("Portal"));

    }


    @Given("the user can not logged in as {string}")
    public void the_user_can_not_logged_in_as(String Invalid_userType) {

        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username =null;
        String password =null;

        if(Invalid_userType.equals("invalid")){
            username = ConfigurationReader.get("invalid_username");
            password = ConfigurationReader.get("invalid_password");
        }else if(Invalid_userType.equals("")){
            username = ConfigurationReader.get("blank_username");
            password = ConfigurationReader.get("blank_password");
        }


        BrowserUtils.waitFor(1);
        //send username and password and login
        new LoginPage().login(username,password);

        System.out.println("When usertype is "+Invalid_userType+" then PageTitle  = " + Driver.get().getTitle());

        Assert.assertFalse(Driver.get().getTitle().contains("Portal"));
    }

    @Given("the user try to login {int} times with {string}")
    public void the_user_try_to_login_times_with(Integer int1, String Invalid_userType) {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("invalid_username");
        String password = ConfigurationReader.get("invalid_password");

        for(int i=0;i<int1;i++) {
            BrowserUtils.waitFor(1);
            new LoginPage().login(username, password);
            BrowserUtils.waitFor(2);
        }
    }
/*
    @Then("the allert should not be {string}")
    public void the_allert_should_not_be(String expectedAllert) {
        String actualAllert= new LoginPage().allert.getText();
        Assert.assertFalse(expectedAllert.equals(actualAllert));
    }
*/
    @Given("user is AFK {int} mins long")
    public void user_is_AFK_mins_long(Integer int1) throws InterruptedException {
        LoginPage lPage= new LoginPage();
/*
        WebDriverWait wait = new WebDriverWait(Driver.get(),1800);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("login-btn")));

 */
        Thread.sleep(1800000);
    }

    @Then("user should not able to navigate any page")
    public void user_should_not_able_to_navigate_any_page() {
        LoginPage lPage= new LoginPage();
        lPage.activityStream.click();
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl="https://qa.agileprocrm.com/stream/?login=yes";
        Assert.assertTrue(expectedUrl.equals(actualUrl));
    }


}
