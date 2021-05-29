package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class MessageFunctioinalityStepDefs {
    @Given("the user logged in as user")
    public void the_user_logged_in_as() {
        BrowserUtils.waitForPageToLoad(2);
        String username = ConfigurationReader.get("client_username");
        String password = ConfigurationReader.get("client_password");

        new LoginPage().login(username,password);
    }
    @When("the user clicks on more tab")
    public void the_user_clicks_on_more_tab() {
        new HomePage().moreButton.click();
        Assert.assertTrue(new HomePage().moreButton.isDisplayed());
    }
    @When("clicks on like button")
    public void clicks_on_like_button() {
        new HomePage().likeButton.click();
        Assert.assertTrue(new HomePage().likeButtonEmoji.isDisplayed());
    }
    @When("the user click on like")
    public void the_user_click_on_like() {
      new HomePage().likeButton.click();
    }
    @Then("like is displayed")
    public void like_is_displayed() {
        Assert.assertTrue(new HomePage().likeButton.isDisplayed());
    }

    ////////////////////////////

    @When("selects user from People")
    public void selects_user_from_People() {
        BrowserUtils.waitFor(3);
      new HomePage().h1user.click();
    }
    @When("clicks on Add button")
    public void clicks_on_Add_button() {
        BrowserUtils.waitFor(2);
        new HomePage().closeWindowX.click();
        new HomePage().addButton.click();


    }
    @Then("Shared with message should appear")
    public void shared_with_message_should_appear() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new HomePage().sharedMessage.isDisplayed());
    }


    @Then("done icon should be displayed")
    public void done_icon_should_be_displayed() {
        BrowserUtils.waitFor(3);

      // Assert.assertTrue(new HomePage().doneEmoji.isDisplayed());
        String id = new HomePage().copyButton.getAttribute("id");
        String idEmoji = id.substring(0,14);
        WebElement doneEmoji = Driver.get().findElement(By.id(idEmoji+"link-icon-done"));
        Assert.assertTrue(doneEmoji.isDisplayed());

    }
    @When("clicks on add to favorites")
    public void clicks_on_add_to_favorites() {
        BrowserUtils.waitFor(2);

        try {
            new HomePage().favButton.click();
        }catch (Exception e){
            new HomePage().RemovefavButton.click();
            BrowserUtils.waitFor(1);
            new HomePage().favButton.click();
        }

    }

    @Then("add to favorites needs to change")
    public void add_to_favorites_needs_to_change() {
        BrowserUtils.waitFor(2);

        Assert.assertTrue(new HomePage().RemovefavButton.isDisplayed());
    }


    @And("selects add recipients")
    public void selectsAddRecipients() {
        BrowserUtils.waitFor(3);
        new HomePage().recipientsButton.click();

    }

    @And("clicks on copy button")
    public void clicksOnCopyButton() {
        BrowserUtils.waitFor(2);
        new HomePage().copyButton.click();
    }
}
