package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage extends BasePage {

    public CompanyPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css="li#bx_left_menu_menu_about_sect")
    public WebElement companyButton;

    @FindBy(xpath = "(//span[@class='webform-small-button-text'])[2]")
    public WebElement newsButton;

    @FindBy(xpath = "//a[@class='ui-btn ui-btn-primary']")
    public WebElement addNewsOnNewspage;

    @FindBy(css = "h1#adm-title")
    public WebElement newsImportantInformation;


    @FindBy(xpath = "//a[@title='Add News']")
    public WebElement addNews;

    @FindBy(css = "span[class='bx-core-adm-dialog-head-inner']")
    public WebElement addNewsWindow;

    @FindBy(css = "span[title='Close']")
    public WebElement CloseAddNewsWindow;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[1]")
    public WebElement Official_Information;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement Our_Life;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[3]")
    public WebElement About_Company;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[4]")
    public WebElement Photo_Gallery;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[5]")
    public WebElement Video;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[6]")
    public WebElement Career;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[7]")
    public WebElement moreCareer;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[7]")
    public WebElement Business_NewsRSS;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[8]")
    public WebElement moreBusiness_NewsRSS;

    @FindBy(css = "span#pagetitle")
    public WebElement VerifyPageOpened;

    @FindBy(xpath = "(//div[@class='gdheader-title'])[2]")
    public WebElement RSSFeed;

    @FindBy(xpath = "(//span[@class='webform-small-button-text'])[1]")
    public  WebElement AddVacancy;

    @FindBy(xpath = "(//span[@class='webform-small-button-text'])[2]")
    public WebElement Vacancies;

    @FindBy(css = "a#bx-panel-view-tab")
    public WebElement mainPage;

    @FindBy(linkText = "jsPublicTVCollector.tv[0].PlayFile(0,0,true,true)")
    public WebElement playVideo;

    @FindBy(css = "a[href='#']")
    public WebElement More;



    public boolean isElementPresent(By newsButton) {
        try {
            Driver.get().findElement(newsButton);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }




}
