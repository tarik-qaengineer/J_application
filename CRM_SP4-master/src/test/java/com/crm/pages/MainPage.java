package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "user-block")
    public WebElement userBlock;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOut;
}
