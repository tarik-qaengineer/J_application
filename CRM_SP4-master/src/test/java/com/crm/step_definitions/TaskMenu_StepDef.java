package com.crm.step_definitions;

import com.crm.pages.TaskPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TaskMenu_StepDef {

    @Given("User can display create a new task window by clicking on {string}.")
    public void user_can_display_window_by_clicking_on(String Tasks) {
        TaskPage taskPage = new TaskPage();
        taskPage.task.click();


        /*
        BrowserUtils.waitFor(5);
        Driver.get().switchTo().frame("iframe_0pfz1ssndw");
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.xpath("//span[@id='pagetitle'][contains(text(),'New task')]")).getText();
         */

        String Url_BeforeClickNewTask = Driver.get().getCurrentUrl();
        System.out.println("URL before New task window = " + Url_BeforeClickNewTask);
        taskPage.NewTask.click();

        BrowserUtils.waitFor(3);
        String Url_AfterClickNewTask = Driver.get().getCurrentUrl();

        System.out.println("URL the New task window = " + Url_AfterClickNewTask);
        Assert.assertNotEquals(Url_BeforeClickNewTask,Url_AfterClickNewTask);

        taskPage.closeNewTaskWindow.click();

    }

    @When("User can display the task which is assisted by clicking Assisting")
    public void user_can_display_the_task_which_is_assisted_by_clicking_Assisting() {
        TaskPage taskPage =new TaskPage();
        taskPage.task.click();
        taskPage.TaskAssisting.click();

        String expectedResult = "Role: Assisting";
        String actualResult = taskPage.VerifyOnSearchButton.getText();
        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);

        Assert.assertEquals(expectedResult,actualResult);

    }


    @When("User can display Ongoing task.")
    public void user_can_display_Ongoing_task() {
        TaskPage taskPage = new TaskPage();
        taskPage.task.click();
        taskPage.TaskOngoing.click();

        //get the text from search button which click to display
        String actualResult=taskPage.VerifyOnSearchButton.getText();
        String expectedResult ="Role: Ongoing";
        System.out.println("actualResult = " + actualResult);
        System.out.println("expectedResult = " + expectedResult);

        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("User can display existing task\\(s) set by him under MyTask.")
    public void user_can_display_existing_task_s_set_by_him_under_MyTask() {
        TaskPage taskPage=new TaskPage();
        taskPage.task.click();
        taskPage.TaskSetByMe.click();

        String expectedResult ="Role: Set by me";
        String actualResult = taskPage.VerifyOnSearchButton.getText();
        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);

        Assert.assertEquals(expectedResult,actualResult);


    }


    @When("User can display existing project\\(s) table.")
    public void user_can_display_existing_project_s_table() {
        TaskPage taskPage = new TaskPage();
        taskPage.task.click();
        taskPage.TaskProject.click();

        //get the title after clicking project
        String actualResult=Driver.get().getTitle();
        String expectedResult ="(3) Projects";
        System.out.println("actualResult = " + actualResult);
        System.out.println("expectedResult = " + expectedResult);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("User can display efficiency board.")
    public void user_can_display_efficiency_board() {
        TaskPage taskPage = new TaskPage();
        taskPage.task.click();

        BrowserUtils.waitFor(3);
        //Efficiency button can be reachable or under the More option!
        if(taskPage.TaskEfficiency.isEnabled()) {
            System.out.println("Yes TaskEfficiency is Enable");
            taskPage.TaskEfficiency.click();
        }else {
            taskPage.More.click();
            taskPage.TaskEfficiency.click();
        }


        //get the name of Efficiency Board after click the Efficiency
        String actualResult= taskPage.efficiencyBoard.getText();
        String expectedResult ="My Efficiency";
        System.out.println("actualResult = " + actualResult);
        System.out.println("expectedResult = " + expectedResult);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("User can display Recycle Bin.")
    public void user_can_display_Recycle_Bin() {
        TaskPage taskPage = new TaskPage();
        taskPage.task.click();
        BrowserUtils.waitFor(3);

        taskPage.More.click();
        System.out.println("Yes TaskRecycleBin is Enable");
        BrowserUtils.waitFor(2);
        taskPage.MoreTaskRecycleBin.click();

        //get the title after clicking the Recycle Bin
        String actualResult=Driver.get().getTitle();
        String expectedResult ="(3) Recycle Bin";
        System.out.println("actualResult = " + actualResult);
        System.out.println("expectedResult = " + expectedResult);

        Assert.assertEquals(expectedResult,actualResult);
    }





}
