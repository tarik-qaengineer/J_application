package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickNavMenuPage extends BasePage{

    public QuickNavMenuPage(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//span[starts-with(text(),'Message')]")
    public WebElement messageButton;

    @FindBy(xpath = "/html/body")
    public WebElement textField;

    @FindBy(xpath = "//*[@class='feed-add-post-del-but']")
    public WebElement allEmployees;

    @FindBy(css = "#bx-destination-tag")
    public WebElement addPerson;

    @FindBy(css = "#feed-add-post-destination-input-box>input")
    public WebElement searchBar;

    @FindBy(css = "div.bx-finder-box-item-t7-name")
    public WebElement user;

    @FindBy(xpath="(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendMessageButton;

    @FindBy (css = "span#feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement fileButton;

    @FindBy(xpath = "(//div[@class='diskuf-uploader'])[1]")
    public WebElement uploadButton;

    @FindBy(css = "button#blog-submit-button-save")
    public WebElement sendFileButton;

    @FindBy(xpath = "(//*[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[1]")
    public WebElement selectDocButton;

    @FindBy(xpath = "(//*[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file'])[1]")
    public WebElement pickDocButton;

    @FindBy(xpath = "//*[@class='popup-window-button popup-window-button-accept']")
    public WebElement selectButton;

    @FindBy(css = "span#feed-add-post-form-tab-calendar>span")
    public WebElement eventButton;

    @FindBy(xpath = "//input[@name='EVENT_NAME']")
    public WebElement eventName;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement eventText;

    @FindBy(css="input#feed-cal-event-fromcal_3Jcl")
    public WebElement dateFrom;

    @FindBy(css= "input#feed_cal_event_from_timecal_3Jcl")
    public WebElement hourBox;

    @FindBy(xpath="(//input[@class='bxc-cus-sel'])[1]")
    public WebElement hourFrom;

    @FindBy(xpath="(//input[@class='bxc-cus-sel'])[2]")
    public WebElement minutesFrom;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement setTimeButton;

    @FindBy(css="#feed-cal-event-tocal_3Jcl")
    public WebElement dateTo;

    @FindBy(css = "#feed_cal_event_to_timecal_3Jcl")
    public WebElement hourBox2;

    @FindBy(css = "#event-locationcal_3Jcl")
    public WebElement location;

    @FindBy(css = "button#blog-submit-button-save")
    public WebElement sendEventButton;

    @FindBy(css="#feed-event-dest-add-link")
    public WebElement memberSearchLink;

    @FindBy(css="#feed-event-dest-input")
    public WebElement memberSearchBox;

    @FindBy(css = "span#feed-add-post-form-tab-vote>span")
    public WebElement pollButton;

    @FindBy(xpath = "/html/body")
    public WebElement pollText;

    @FindBy(css = "#bx-destination-tag")
    public WebElement addMore;

    @FindBy(css = "#feed-add-post-destination-input")
    public WebElement pollTo;

    @FindBy(css="#question_0")
    public WebElement pollQuestion;

    @FindBy(css="#answer_0__0_")
    public WebElement pollAnswer1;

    @FindBy(css="#answer_0__1_")
    public WebElement pollAnswer2;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement pollSendButton;

    @FindBy(xpath = "//div[@class='bx-vote-question-title']")
    public WebElement pollContent;

    @FindBy(css = "#feed-add-post-form-tab-tasks>span")
    public WebElement taskButton;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskHeader;

    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement taskText;

    @FindBy(xpath = "(//span[@class='js-id-tdp-mem-sel-is-item-delete task-form-field-item-delete'])[1]")
    public WebElement deleteUser;

    @FindBy(xpath = "(//input[@class='js-id-tdp-mem-sel-is-search js-id-network-selector-search task-form-field-search task-form-field-input'])[1]")
    public WebElement personSearchBox;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[1]")
    public WebElement pickDate;

    @FindBy(xpath = "//*[@*='1616025600000']")
    public WebElement pickDay;

    @FindBy(xpath = "(//*[@*='bx-calendar-form-input'])[1]")
    public WebElement pickHour;

    @FindBy(xpath = "(//*[@*='bx-calendar-form-input'])[2]")
    public WebElement pickMinute;

    @FindBy(xpath = "(//span[@class='bx-calendar-button-text'])[1]")
    public WebElement selectDate;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendTaskButton;

    @FindBy(xpath = "//div[@class='feed-task-info-label']")
    public WebElement taskContent;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationButton;

    @FindBy(xpath = "/html/body")
    public WebElement appreciationText;

    @FindBy(css = "#feed-add-post-destination-input")
    public WebElement appreciationTo;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendAppreciationButton;

    @FindBy(xpath = "(//div[starts-with(@id,'blog_post_body_')])[1]")
    public WebElement appreciationContent;

    @FindBy (css = "span#feed-add-post-form-link-text")
    public WebElement moreButton2;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[4]")
    public WebElement workflowButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[5]")
    public WebElement leaveApprovalButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[6]")
    public WebElement businessTrip;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[7]")
    public WebElement generalRequests;

    @FindBy (xpath = "//input[@name='NAME']")
    public WebElement title;

    @FindBy (xpath = "//textarea[@name='PREVIEW_TEXT']")
    public WebElement description;

    @FindBy (xpath = "(//div[@class='finder-box-item-text'])[1]")
    public WebElement recipient;

    @FindBy (xpath = "//a[starts-with(@id,'single')]")
    public WebElement select;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendGRButton;

    @FindBy(xpath = "//a[@class='bx-lists-live-feed-title-link']")
    public WebElement gRequestContent;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[8]")
    public WebElement purchaseRequest;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[9]")
    public WebElement expenseReport;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[10]")
    public WebElement workflowDirectory;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[11]")
    public WebElement settings;

    @FindBy(xpath = "//*[starts-with(@id,'blog_post_body_')]")
    public WebElement messageContent;

    @FindBy(xpath = "//*[starts-with(@id,'disk-attach-')]")
    public WebElement fileContent;

    @FindBy(xpath = "(//div[@class='feed-add-post-destination-title'])[1]")
    public WebElement eventContent;





}
