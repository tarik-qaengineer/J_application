package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "logo_24_a")
    public WebElement homebutton;


    @FindBy(xpath = "//a[@href='#like'][1]")
    public WebElement likeButton;

    @FindBy(css = "span[id*='feed-post-more-']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Add to favorites'][1]")
    public WebElement favButton;

    @FindBy(xpath = "//*[text() = 'Remove from favorites']")
    public WebElement RemovefavButton;



    @FindBy(xpath = "//*[text() = 'Copy link']")
    public WebElement copyButton;

    @FindBy(xpath = "//*[text() = 'Add recipients'][1]")
    public WebElement recipientsButton;


    @FindBy(css = "a[id$='_U693']")
    public WebElement h1user;

    @FindBy(id = "sharePostSubmitButton")
    public WebElement addButton;

    @FindBy(xpath = "//a[@class='blog-p-user-name']")
    public WebElement sharedMessage;

    @FindBy(id = "bx-ilike-result-reaction-like-BLOG_POST_115-1614864245")
    public WebElement likeButtonEmoji;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closeWindowX;



}
