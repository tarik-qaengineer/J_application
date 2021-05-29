package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage extends BasePage {

    public DrivePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[.='My Drive']")
    public WebElement myDrive;

    @FindBy(xpath = "//span[.='Company Drive']")
    public WebElement companyDrive;


}
