package com.crm.step_definitions;

import com.crm.pages.TrainingPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TrainingStepDefs {
   TrainingPage trainingPage=new TrainingPage();

    @Given("the user clicks training")
    public void the_user_clicks_training() {
        trainingPage.trainigTab.click();
    }
    @Given("the user can see his grades")
    public void the_user_can_see_his_grades() {
        Assert.assertTrue(trainingPage.pageTitle.getText().equals("Test results"));
    }



    @Given("the user copies the first course and type in find box")
    public void the_user_copies_the_first_course_and_type_in_find_box() {
        String firstCourse=trainingPage.firstAvailableCourse.getText();
        trainingPage.findBox.sendKeys(firstCourse);
    }
    @When("the user clicks search in training")
    public void the_user_clicks_search_in_training() {
        trainingPage.searchButton.click();
    }
    @Then("user sees the course listed in search results")
    public void user_sees_the_course_listed_in_search_results() {
       // System.out.println(trainingPage.firstListedCourse.getText());
        trainingPage.firstListedCourse.click();
        Assert.assertEquals("verifycourse title","New Employee Handbook", Driver.get().getTitle());
    }

    @When("the user navigates back to search page")
    public void the_user_navigates_back_to_search_page() {
        Driver.get().navigate().back();
    }



    @When("change search option")
    public void change_search_option() {
        Select select = new Select(trainingPage.whereSelect);
        //System.out.println("select.getOptions() = " + BrowserUtils.getElementsText(select.getOptions()));
        select.selectByIndex(1);
    }
    @When("clcicks go button")
    public void clcicks_go_button() {
        trainingPage.goButton.click();
    }
    @Then("user can find the course again")
    public void user_can_find_the_course_again() {
        trainingPage.firstListedCourse.click();
    }
    @When("the user goes to {string}")
    public void the_user_goes_to(String tab) {
        trainingPage.goTrainingSubpage(tab);
    }



    @Then("the user see his courses")
    public void the_user_see_his_courses() {
        Assert.assertTrue("verify that there is a course",trainingPage.myCoursesFirstCell.isDisplayed());
    }

    @When("the user fills the form")
    public void the_user_fills_the_form() {
        // this method can change PERSONAL_WWW, PERSONAL_ICQ, PERSONAL_STATE,PERSONAL_CITY,PERSONAL_ZIP,PERSONAL_STREET
       trainingPage.sendTextToForm("NAME","Fatih");
       trainingPage.sendTextToForm("LAST_NAME","Deniz");
       trainingPage.sendTextToForm("PERSONAL_WWW","deniz@fatih.com");
       trainingPage.sendTextToForm("PERSONAL_STATE","OH");
       trainingPage.sendTextToForm("PERSONAL_CITY","Dayton");
    }


    @When("the user clicks save profile")
    public void the_user_clicks_save_profile() {
      trainingPage.saveButton.click();
    }
    @Then("the user sees the profile saved")
    public void the_user_sees_the_profile_saved() {
        Assert.assertEquals("Fatih",Driver.get().findElement(By.xpath("//input[@name='NAME']")).getAttribute("value"));

    }


}
