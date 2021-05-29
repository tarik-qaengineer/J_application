package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class ActivityStreamPage extends BasePage{
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath="//input[@id='LIVEFEED_search']")
    public WebElement searchBox;

    @FindBy(css = "#LIVEFEED_search")
    public WebElement seachLiveBox;

    @FindBy(xpath = "//div[@data-id='work']")
    public WebElement work;

    @FindBy(xpath = "//div[@data-id='favorites']")
    public WebElement favorites;

    @FindBy(xpath = "//div[@data-id='my']")
    public WebElement myActivity;

    @FindBy(xpath = "//div[@data-id='important']")
    public WebElement announcements;

    @FindBy(xpath = "//div[@data-id='bizproc']")
    public WebElement workflows;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement dateSelect;

    @FindBy(xpath = "//*[@data-item='{\"NAME\":\"Yesterday\",\"VALUE\":\"YESTERDAY\"}']")
    public WebElement yesterday;

    @FindBy(css = "button.ui-btn.ui-btn-primary.ui-btn-icon-search.main-ui-filter-field-button.main-ui-filter-find")
    public WebElement searchButton;

    @FindBy(css = "div.main-ui-square-item")
    public WebElement SearcBoxItemSelected;

    @FindBy(css = "div.main-ui-item-icon.main-ui-square-delete")
    public WebElement deleteSelected;

    @FindBy(css = "input.main-ui-control-input.main-ui-number-input")
    public WebElement inputNdays;

    @FindBy(xpath = "//div[@data-name='EVENT_ID'][@data-params='{\"isMulti\":true}']")
    public WebElement typeBox;

    @FindBy(xpath = "//div[@class='popup-multiselect-content']//div[contains(@data-item,'{\"NAME\":\"')]")
    public List<WebElement> types;

    @FindBy(xpath = "//div[@data-item='{\"type\":\"control\",\"name\":\"EVENT_ID\"}']//div[@class='main-ui-square-item']")
    public WebElement typeSelectedinSerchBox;

    @FindBy(css = ".ui-btn.ui-btn-light-border.main-ui-filter-field-button.main-ui-filter-reset")
    public WebElement resetButton;

    @FindBy(xpath = "//input[@name='TO_label']")
    public WebElement toBox;

    @FindBy(css = "[name=CREATED_BY_ID_label]")
    public WebElement authorBox;

    @FindBy(css = "#destDepartmentTab_CREATED_BY_ID")
    public WebElement departmentsAndEmplyeesInAuthorSearch;

    @FindBy(css = "##destDepartmentTab_TO")
    public WebElement departmentsAndEmplyeesInTOSearch;

    @FindBy(css = "##destLastTab_CREATED_BY_ID")
    public WebElement drecentInAuthorSearch;

    @FindBy(xpath = "//div[@data-item='{\"type\":\"control\",\"name\":\"CREATED_BY_ID\"}']//div[@class='main-ui-square-item']")
    public WebElement authorSelected;

    @FindBy(xpath = "//div[@data-item='{\"type\":\"control\",\"name\":\"TO\"}']//div[@class='main-ui-square-item']")
    public WebElement toSelected;

    @FindBy(xpath = "//div[@data-item='{\"type\":\"control\",\"name\":\"TAG\"}']//div[@class='main-ui-square-item']")
    public WebElement tagSelected;

    @FindBy(css = ".main-ui-filter-field-add-item")
    public WebElement addField;

    @FindBy(css = "[data-id=field_TAG] div.main-ui-select-inner-label")
    public WebElement tag;

    @FindBy(xpath = "//input[@name='TAG']")
    public WebElement tagBox;

    @FindBy(css = ".main-ui-filter-add-item")
    public WebElement saveFilter;

    @FindBy(css = ".main-ui-filter-field-button-inner .ui-btn.ui-btn-success.main-ui-filter-field-button.main-ui-filter-save")
    public WebElement saveButton;

    @FindBy(css = ".main-ui-filter-sidebar-edit-control")
    public WebElement filterNameBox;

    public WebElement findSavedFilter(String filter){
      return  Driver.get().findElement(By.xpath("//*[@class='main-ui-filter-sidebar-item-text'][contains(text(),'"+filter+"')]"));
    }

    public WebElement authorFinder(String email){
        return Driver.get().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name'][contains(text(),'"+email+"')]"));
    }

    public WebElement dateOption(String date, int next){
        return Driver.get().findElement(By.xpath("(//*[@id='popup-window-content-main-filter-control-popup']//div[contains(@data-item,'"+date+"')])["+next+"]"));
    }

    public List<WebElement> findDateOptions () {
        return Driver.get().findElements(By.xpath("(//*[@id='popup-window-content-main-filter-control-popup']//div[contains(@data-item,'NAME')])"));

    }





}
