package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage  {

    public TaskPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "a[title='Tasks']")
    public WebElement TaskMenu;

    @FindBy(id = "bx_left_menu_menu_tasks")
    public WebElement task;

    @FindBy(css = "a#tasks-buttonAdd")
    public WebElement NewTask;

    @FindBy(xpath = "(//button[@*='templateselector-open'])")
    public WebElement VerifyCreateTaskTempl;

    @FindBy(xpath = "//span[@id='pagetitle'][contains(text(),'New task')]")
    public WebElement VerifyNewTaskWindow;

    @FindBy(xpath = "//span[@class='side-panel-close-inner']")
    public WebElement closeNewTaskWindow;

    @FindBy(xpath = "(//div[@class='main-ui-square-item'])[2]")
    public WebElement VerifyOnSearchButton;

    @FindBy(xpath = "(//div[@class='main-ui-square-item'])[1]")
    public WebElement VerifyInProgressProject;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[1]")
    public WebElement AllTask;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[2]")
    public WebElement TaskOngoing;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[3]")
    public WebElement TaskAssisting;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[4]")
    public WebElement TaskSetByMe;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[5]")
    public WebElement TaskFollowing;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[6]")
    public WebElement TaskProject;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[7]")
    public WebElement TaskKanban;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[8]")
    public WebElement TaskEfficiency;

    @FindBy(css = "span[class='task-report-container-title-text']")
    public WebElement efficiencyBoard;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[12]")
    public WebElement TaskRecycleBin;

    @FindBy(css = "a[href='#']")
    public WebElement More;

    @FindBy(xpath = "(//span[@*='main-buttons-item-text-title'])[21]")
    public WebElement MoreTaskRecycleBin;






}
