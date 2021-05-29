package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage extends BasePage {
    public TrainingPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@class='main-buttons-item-text-title'][contains(text(),'Training')]")
    public WebElement trainigTab;

    @FindBy(xpath = "(//input[@name='q'])[2]")
    public WebElement findBox;

    @FindBy(css = "[href='course.php?COURSE_ID=1&INDEX=Y']")
    public WebElement firstAvailableCourse;

    @FindBy(css = "[value=Search]")
    public WebElement searchButton;

    @FindBy(css = "[value=Go]")
    public WebElement goButton;

    @FindBy(css = "[name=where]")
    public WebElement whereSelect;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/a")
    public WebElement firstListedCourse;

    @FindBy(xpath = "//table[@class='learn-certificates-table data-table']//tr/td[1]")
    public WebElement myCoursesFirstCell;

    @FindBy(css = "#pagetitle")
    public WebElement pageTitle;

    @FindBy(xpath = "//input[@name='save']")
    public WebElement saveButton;

    public void sendTextToForm(String formElement, String text){
        Driver.get().findElement(By.xpath("//input[@name='"+formElement+"']")).clear();
        Driver.get().findElement(By.xpath("//input[@name='"+formElement+"']")).sendKeys(text);
    }


    public void goTrainingSubpage(String tab) {
        Driver.get().findElement(By.xpath("//*[@class='main-buttons-item-text-title'][contains(text(),'" + tab + "')]")).click();
    }


}




