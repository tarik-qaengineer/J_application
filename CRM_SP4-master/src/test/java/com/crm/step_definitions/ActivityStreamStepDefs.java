package com.crm.step_definitions;

import com.crm.pages.ActivityStreamPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.http.nio.support.classic.AbstractClassicServerExchangeHandler;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class ActivityStreamStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("the user clicks filter and search")
    public void the_user_clicks_filter_and_search() {
        activityStreamPage.searchBox.click();
        activityStreamPage.resetButton.click();
        BrowserUtils.waitFor(2);
        activityStreamPage.searchBox.click();
    }


    @Given("the user clicks date")
    public void the_user_clicks_date() {
        BrowserUtils.waitFor(3);
        activityStreamPage.dateSelect.click();
    }

    @Given("the user selects and verifies all date options")
    public void the_user_selects_and_verifies_all_date_options() {
        System.out.println(BrowserUtils.getElementsText(activityStreamPage.findDateOptions()));
        List<String> dateOptions = BrowserUtils.getElementsText(activityStreamPage.findDateOptions());
        dateOptions.remove(0);
        int next = 1;

        for (String selectedDateOption : dateOptions) {
            BrowserUtils.waitFor(1);
            activityStreamPage.dateOption(selectedDateOption, next++).click();
            if (selectedDateOption.equals("Last N days"))
                activityStreamPage.inputNdays.sendKeys("5");
            //BrowserUtils.waitFor(5);
            activityStreamPage.searchButton.click();
            System.out.println(selectedDateOption);
            System.out.println("activityStreamPage.SearcBoxItemSelected = " + activityStreamPage.SearcBoxItemSelected.getText());

            if (selectedDateOption.equals("Last N days")) {
                Assert.assertTrue("verify date selected", activityStreamPage.SearcBoxItemSelected.getText().contains("Last 5"));
            } else if (selectedDateOption.equals("Month")) {
                Assert.assertTrue("verify date selected", activityStreamPage.SearcBoxItemSelected.getText().contains("March"));
            } else if (selectedDateOption.equals("Quarter")) {
                Assert.assertTrue("verify date selected", activityStreamPage.SearcBoxItemSelected.getText().contains("quarter"));
            } else if (selectedDateOption.equals("Year")) {
                Assert.assertTrue("verify date selected", activityStreamPage.SearcBoxItemSelected.getText().contains("2021"));
            } else {
                Assert.assertTrue("verify date selected", activityStreamPage.SearcBoxItemSelected.getText().contains(selectedDateOption));
            }
            BrowserUtils.waitFor(1);
            if (!(next > dateOptions.size() - 2))
                activityStreamPage.deleteSelected.click();

            BrowserUtils.waitFor(2);
            activityStreamPage.seachLiveBox.click();
            activityStreamPage.dateSelect.click();
        }
    }


    @When("the user clicks {string} option in search")
    public void the_user_clicks_option_in_search(String filter) {

        switch (filter.toLowerCase()) {
            case "favorites":
                activityStreamPage.favorites.click();
                break;
            case "my activity":
                activityStreamPage.myActivity.click();
                break;
            case "announcements":
                activityStreamPage.announcements.click();
                break;
            case "work":
                activityStreamPage.work.click();
                break;
            case "workflows":
                activityStreamPage.workflows.click();

        }


    }


    @Then("the user can verify the results filtered by {string}")
    public void the_user_can_verify_the_results_filtered_by(String filter) {

        Assert.assertTrue("verify filter option", activityStreamPage.SearcBoxItemSelected.getText().toLowerCase().equals(filter));

    }


    @When("the user clicks type box")
    public void the_user_clicks_type_box() {
        activityStreamPage.typeBox.click();
    }


    @When("the user selects type and search")
    public void the_user_selects_type_and_search() {
        List<WebElement> types = activityStreamPage.types;
        for (WebElement type : types) {
            type.click();
        }
        BrowserUtils.waitFor(2);
        activityStreamPage.searchButton.click();
    }

    @Then("the user see the types selected in searchbox")
    public void the_user_see_the_types_selected_in_searchbox() {
//        System.out.println(activityStreamPage.types.size());
//        List<String> elementsText = BrowserUtils.getElementsText(activityStreamPage.types);
//        System.out.println("elementsText = " + elementsText);
        System.out.println("activityStreamPage.typeSelectedinSerchBox.getText() = " + activityStreamPage.typeSelectedinSerchBox.getText());
        Assert.assertEquals("vrify types selected","Posts, Announcements, Appreciations, Polls, Conversations, Tasks, Working time management, Work reports, Calendar, External source data, Photo gallery, Wiki, Workflows", activityStreamPage.typeSelectedinSerchBox.getText());
    }

    @Given("the user clicks author select box")
    public void the_user_clicks_author_select_box() {
        activityStreamPage.authorBox.click();
    }

    @Given("the user clicks TO select box")
    public void the_user_clicks_TO_select_box() {
        activityStreamPage.toBox.click();
    }

    @Given("the user clcicks employees and departments")
    public void the_user_clcicks_employees_and_departments() {
       activityStreamPage.departmentsAndEmplyeesInAuthorSearch.click();
    }

    @Given("the user clcicks employees and departments in TO")
    public void the_user_clcicks_employees_and_departments_in_TO() {
        activityStreamPage.departmentsAndEmplyeesInTOSearch.click();
    }




    @Given("the user enters author {string}")
    public void the_user_enters_author(String email) {
        activityStreamPage.toBox.sendKeys(email+Keys.ENTER);
       // activityStreamPage.toBox.sendKeys(Keys.ENTER);
    }
    @Given("the user selects author {string}")
    public void the_user_selects_author(String email) {
        activityStreamPage.authorFinder(email).click();
    }

    @When("the user clicks search")
    public void the_user_clicks_search() {
        activityStreamPage.searchButton.click();
    }
    @Then("the user see the results filtered by author {string}")
    public void the_user_see_the_results_filtered_by_author(String email) {
       Assert.assertTrue(activityStreamPage.authorSelected.getText().contains(email));
    }

    @Then("the user see the results filtered by TO {string}")
    public void the_user_see_the_results_filtered_by_TO(String email) {
        Assert.assertTrue(activityStreamPage.toSelected.getText().contains(email));
    }
    @Given("the user clicks add field")
    public void the_user_clicks_add_field() {
      activityStreamPage.addField.click();
    }


    @Given("the user selects tag")
    public void the_user_selects_tag() {
        BrowserUtils.waitFor(4);
        activityStreamPage.tag.click();
    }
    @Given("the user enters {string} in tagBox")
    public void the_user_enters_in_tagBox(String tag) {
        activityStreamPage.tagBox.click();
        activityStreamPage.tagBox.sendKeys(tag+Keys.ENTER);
    }
    @Then("the user see the results filtered by TAG {string}")
    public void the_user_see_the_results_filtered_by_TAG(String tag) {
        BrowserUtils.waitFor(3);
       Assert.assertTrue(activityStreamPage.tagSelected.getText().contains(tag));
    }

    @Given("the user clicks save filter")
    public void the_user_clicks_save_filter() {
    activityStreamPage.saveFilter.click();
    }

    @Given("the user enters filter name {string}")
    public void the_user_enters_filter_name(String filter) {
        activityStreamPage.filterNameBox.sendKeys(filter);
    }
    @When("the user clicks save")
    public void the_user_clicks_save() {
        activityStreamPage.saveButton.click();
    }
    @Then("the user see {string} is available")
    public void the_user_see_is_available(String filter) {
        Assert.assertTrue(activityStreamPage.findSavedFilter(filter).isDisplayed());
    }


}

//        BrowserUtils.waitFor(1);
//        activityStreamPage.dateSelect.click();
//
//        activityStreamPage.dateOption("Yesterday",next++).click();
//        activityStreamPage.dateSelect.click();
//        activityStreamPage.dateOption("This week",next++).click();
//        activityStreamPage.dateSelect.click();
//        activityStreamPage.dateOption("This month",next++).click();
//        //System.out.println(Driver.get().getPageSource());
