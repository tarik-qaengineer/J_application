package com.crm.step_definitions;

import com.crm.pages.QuickNavMenuPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class QuickNavMenuStepDefs {

    @When("the user clicks message button")
    public void the_user_clicks_message_button() {
        new QuickNavMenuPage().messageButton.click();
    }

    @When("the user writes message text")
    public void the_user_writes_message_text() {

        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(4);
        new QuickNavMenuPage().textField.sendKeys("some text here");
        BrowserUtils.waitFor(4);
        Driver.get().switchTo().parentFrame();
    }

    @When("the user puts recipient email address")
    public void the_user_puts_recipient_email_address() {
        BrowserUtils.waitFor(4);
        new QuickNavMenuPage().allEmployees.click();
        BrowserUtils.waitFor(4);
        new QuickNavMenuPage().addPerson.click();
        new QuickNavMenuPage().searchBar.sendKeys("hr3@cybertekschool.com");
        new QuickNavMenuPage().user.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user clicks the send button")
    public void the_user_clicks_the_send_button() {
        new QuickNavMenuPage().sendMessageButton.click();
    }

    @Then("sent message should match the last message on activity stream")
    public void sent_message_should_match_the_last_message_on_activity_stream() {
        BrowserUtils.waitFor(5);
        String actualMessage = new QuickNavMenuPage().messageContent.getText();
        String expectedMessage = "some text here";
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("the user clicks More button in quick navigate menu")
    public void the_user_clicks_More_button_in_quick_navigate_menu() {
        new QuickNavMenuPage().moreButton.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user clicks File button")
    public void the_user_clicks_File_button() {
        new QuickNavMenuPage().fileButton.click();
    }

    @When("the user uploads file by clicking Upload files and images field")
    public void the_user_uploads_file_by_clicking_Upload_files_and_images_field() {
        new QuickNavMenuPage().uploadButton.click();
        Driver.get().switchTo().activeElement().sendKeys("C:/Users/HP ELITEBOOK 840 G1/this_is_my_first_file");
    }

    @When("the user selects file by clicking Select Document from Bitrix24 field")
    public void the_user_selects_file_by_clicking_Select_Document_from_Bitrix24_field() {
        new QuickNavMenuPage().selectDocButton.click();
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().pickDocButton.click();
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().selectButton.click();
    }

    @When("the user choose recipient email address")
    public void the_user_choose_recipient_email_address() {
        // No searchbar
    }

    @When("the user clicks Send button")
    public void the_user_clicks_send_button() {
        new QuickNavMenuPage().sendFileButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("sent file should match the last file on activity stream")
    public void sent_file_should_match_the_last_file_on_activity_stream() {
        Assert.assertTrue(new QuickNavMenuPage().fileContent.isDisplayed());
    }

    @Given("the user clicks Event button on quick navigate menu")
    public void the_user_clicks_Event_button_on_quick_navigate_menu() {
        new QuickNavMenuPage().eventButton.click();
        BrowserUtils.waitFor(3);
    }

    @Given("the user writes event content")
    public void the_user_writes_event_content() {
        new QuickNavMenuPage().eventName.sendKeys("some event name message");
        Driver.get().switchTo().frame(1);
        new QuickNavMenuPage().eventText.sendKeys("some event description");
        Driver.get().switchTo().parentFrame();
    }

    @Given("the user determines event date in calendar field")
    public void the_user_determines_event_date_in_calendar_field() {
        new QuickNavMenuPage().dateFrom.clear();
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().dateFrom.sendKeys("01/01/2020");
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().hourBox.click();
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().hourFrom.clear();
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().hourFrom.sendKeys("1");
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().minutesFrom.clear();
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().minutesFrom.sendKeys("2");
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().setTimeButton.click();
        BrowserUtils.waitFor(4);
        new QuickNavMenuPage().dateTo.click();
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().dateFrom.sendKeys("23/01/2020");
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().hourBox2.click();

    }

    @Given("the user picks meeting room")
    public void the_user_picks_meeting_room() {
        new QuickNavMenuPage().location.click();
    }

    @Given("the user picks event members by clicking searchbox")
    public void the_user_picks_event_members_by_clicking_searchbox() {
        new QuickNavMenuPage().memberSearchLink.click();
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().memberSearchBox.sendKeys("marketing2@cybertekschool.com");
        BrowserUtils.waitFor(3);

    }

    @Given("the user clicks Send button on event field")
    public void the_user_clicks_Send_button_on_event_field() {

        new QuickNavMenuPage().sendEventButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("created event should match the last event on activity stream")
    public void created_event_should_match_the_last_event_on_activity_stream() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(new QuickNavMenuPage().eventContent.isDisplayed());
    }


    @Given("the user clicks Poll button on quick navigate menu")
    public void the_user_clicks_Poll_button_on_quick_navigate_menu() {
        new QuickNavMenuPage().pollButton.click();
    }

    @Given("the user writes poll text")
    public void the_user_writes_poll_text() {
        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().pollText.sendKeys("some poll text");
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();
    }

    @Given("the user picks recipient by clicking searchbox")
    public void the_user_picks_recipient_by_clicking_searchbox() {
        new QuickNavMenuPage().addMore.click();
        new QuickNavMenuPage().pollTo.sendKeys("hr9@cybertekschool.com");
    }

    @Given("the user writes question content")
    public void the_user_writes_question_content() {
        new QuickNavMenuPage().pollQuestion.sendKeys("How are you?");
    }

    @Given("the user writes answer options")
    public void the_user_writes_answer_options() {
        new QuickNavMenuPage().pollAnswer1.sendKeys("Fine");
        new QuickNavMenuPage().pollAnswer2.sendKeys("Not bad");
    }

    @Given("the user clicks send button on poll field")
    public void the_user_clicks_send_button_on_poll_field() {
        new QuickNavMenuPage().pollSendButton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the created poll should match the last poll on activity stream")
    public void the_created_poll_should_match_the_last_poll_on_activity_stream() {
        Assert.assertTrue(new QuickNavMenuPage().pollContent.isDisplayed());
    }

    @Given("the user clicks Task button on quick navigate menu")
    public void the_user_clicks_Task_button_on_quick_navigate_menu() {
        new QuickNavMenuPage().taskButton.click();
        BrowserUtils.waitFor(3);
    }

    @Given("the user writes task text")
    public void the_user_writes_task_text() {
        new QuickNavMenuPage().taskHeader.sendKeys("some task header");
        Driver.get().switchTo().frame(1);
        BrowserUtils.waitFor(2);
        new QuickNavMenuPage().taskText.sendKeys("some task text");
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().parentFrame();
    }

    @Given("the user picks responsible person by clicking searchbox")
    public void the_user_picks_responsible_person_by_clicking_searchbox() {
        new QuickNavMenuPage().deleteUser.click();
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().personSearchBox.sendKeys("hr7@cybertekschool.com");
    }

    @Given("the user picks deadline on calendar")
    public void the_user_picks_deadline_on_calendar() {
        new QuickNavMenuPage().pickDate.click();
        new QuickNavMenuPage().pickDay.click();
        new QuickNavMenuPage().pickHour.clear();
        new QuickNavMenuPage().pickHour.sendKeys("09");
        new QuickNavMenuPage().pickMinute.clear();
        new QuickNavMenuPage().pickMinute.sendKeys("59");
        new QuickNavMenuPage().selectDate.click();
    }

    @Given("the user clicks send button on task field")
    public void the_user_clicks_send_button_on_task_field() {
        new QuickNavMenuPage().sendTaskButton.click();
    }

    @Then("the created task should match the last task on activity stream")
    public void the_created_task_should_match_the_last_task_on_activity_stream() {
        Assert.assertTrue(new QuickNavMenuPage().taskContent.isDisplayed());
    }

    @Given("the user clicks more button in quick navigate menu")
    public void the_user_clicks_more_button_in_quick_navigate_menu() {
        new QuickNavMenuPage().moreButton.click();
        BrowserUtils.waitFor(5);
    }

    @Given("the user clicks Appreciation button")
    public void the_user_clicks_Appreciation_button() {
        new QuickNavMenuPage().appreciationButton.click();
        BrowserUtils.waitFor(3);
    }

    @Given("the user writes appreciation content")
    public void the_user_writes_appreciation_content() {
        Driver.get().switchTo().frame(1);
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().appreciationText.sendKeys("some appreciation text");
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().parentFrame();
    }

    @Given("the user chooses recipients by clicking searchbox")
    public void the_user_chooses_recipients_by_clicking_searchbox() {
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().addMore.click();
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().appreciationTo.sendKeys("hr7@cybertekschool.com");
        BrowserUtils.waitFor(3);
    }

    @Given("the user clicks Send button on appreciation field")
    public void the_user_clicks_Send_button_on_appreciation_field() {
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().sendAppreciationButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the sent appreciation should match last appreciation on activity stream")
    public void the_sent_appreciation_should_match_last_appreciation_on_activity_stream() {
        Assert.assertTrue(new QuickNavMenuPage().appreciationContent.isDisplayed());
    }

    @Given("the user clicks Workflow button")
    public void the_user_clicks_Workflow_button() {

        new QuickNavMenuPage().workflowButton.click();
        BrowserUtils.waitFor(3);
    }

    @Given("the user clicks General requests button")
    public void the_user_clicks_General_requests_button() {
        new QuickNavMenuPage().generalRequests.click();
    }

    @Given("the user writes title by clicking Title text field")
    public void the_user_writes_title_by_clicking_Title_text_field() {
        new QuickNavMenuPage().title.sendKeys("some title");
    }

    @Given("the user writes description by clicking Description field")
    public void the_user_writes_description_by_clicking_Description_field() {
        new QuickNavMenuPage().description.sendKeys("some description");
    }

    @Given("the user picks Priority level by clicking from dropdown menu")
    public void the_user_picks_Priority_level_by_clicking_from_dropdown_menu() {
        Select ddPriority = new Select(Driver.get().findElement(By.name("PROPERTY_84")));
        ddPriority.selectByVisibleText("Low");
        ddPriority.selectByVisibleText("Medium");
        ddPriority.selectByVisibleText("High");
    }

    @Given("the user picks recipient by clicking searchbar")
    public void the_user_picks_recipient_by_clicking_searchbar() {
        new QuickNavMenuPage().select.click();
        BrowserUtils.waitFor(3);
        new QuickNavMenuPage().recipient.click();
        BrowserUtils.waitFor(3);

    }

    @Given("the user clicks Send button on general request field")
    public void the_user_clicks_Send_button_on_general_request_field() {
        new QuickNavMenuPage().sendGRButton.click();
        BrowserUtils.waitFor(10);

    }

    @Then("the created general request should match the last general request on activity stream")
    public void the_created_general_request_should_match_the_last_general_request_on_activity_stream() {
        Assert.assertTrue(new QuickNavMenuPage().gRequestContent.isDisplayed());
    }
}
