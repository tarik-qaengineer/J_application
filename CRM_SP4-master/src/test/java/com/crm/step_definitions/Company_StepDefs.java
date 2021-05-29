package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Company_StepDefs {

    @Given("the user can be logged in as {string}")
    public void theUserCanBeLoggedInAs(String userType) {

        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equals("HR")){
            username = ConfigurationReader.get("HR_username");
            password = ConfigurationReader.get("HR_password");
        }else if(userType.equals("Helpdesk")){
            username = ConfigurationReader.get("Helpdesk_username");
            password = ConfigurationReader.get("Helpdesk_password");
        }else if(userType.equals("Marketing")){
            username = ConfigurationReader.get("Marketing_username");
            password = ConfigurationReader.get("Marketing_password");
        }


        BrowserUtils.waitFor(1);
        //send username and password and login
        new LoginPage().login(username,password);

        System.out.println("When usertype is "+userType+" then PageTitle  = " + Driver.get().getTitle());

    }

    @When("User can display News window by clicking on News button. Only valid for {string} users.")
    public void userCanDisplayNewsWindowByClickingOnNewsButtonOnlyValidForUsers(String userType) {

        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();


            companyPage.newsButton.click();
            BrowserUtils.waitFor(3);
            String expectedResult = "Important information - nextbasecrm.com";
            String actualResult = Driver.get().getTitle();
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("actualResult = " + actualResult);

            Assert.assertEquals(expectedResult, actualResult);


    //    companyPage.mainPage.click();

    }

    @When("User can display Add News window by clicking on Add News button. Only valid for {string} users.")
    public void userCanDisplayAddNewsWindowByClickingOnAddNewsButtonOnlyValidForUsers(String userType) {
        CompanyPage companyPage = new CompanyPage();
     //   companyPage.companyButton.click();



            BrowserUtils.waitFor(2);
            companyPage.addNewsOnNewspage.click();
            String expectedResult = "Important information: News: New element";
            String actualResult = companyPage.newsImportantInformation.getText();
            BrowserUtils.waitFor(2);
            Assert.assertEquals(expectedResult, actualResult);




    }




    @Then("User can display {string} by clicking on {string} tab.")
    public void user_can_display_by_clicking_on_tab(String displayElement, String clickTab) {

        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();
        companyPage.Official_Information.click();

        String expectedResult = "Company";
        String actualResult = companyPage.VerifyPageOpened.getText();

        Assert.assertEquals(expectedResult,actualResult);


    }




        @Given("User can see {string} window by clicking on {string} tab.")
        public void user_can_see_window_by_clicking_on_tab(String string, String string2) {
        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();
        companyPage.Our_Life.click();

        String expectedResult = "Company life";
        String actualResult = companyPage.VerifyPageOpened.getText();

        Assert.assertEquals(expectedResult,actualResult);

        }

       @Given("User can see {string} window by clicking on {string} Tab.")
       public void user_can_see_window_by_clicking_on_Tab(String string, String string2) {
        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();
        companyPage.About_Company.click();

        String expectedResult = "Company";
        String actualResult = companyPage.VerifyPageOpened.getText();

        Assert.assertEquals(expectedResult,actualResult);


       }



    @Given("User can see an album and photos page by clicking {string} tab.")
    public void user_can_see_an_album_and_photos_page_by_clicking_tab(String tab) {

        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();
        companyPage.Photo_Gallery.click();

        String expectedResult = "Photo gallery";
        String actualResult = companyPage.VerifyPageOpened.getText();

        Assert.assertEquals(expectedResult,actualResult);
    }



    @Given("User can display video player window by clicking {string} tab.")
    public void user_can_display_video_player_window_by_clicking_tab(String string) {

        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();
        companyPage.Video.click();
        companyPage.playVideo.click();



        Assert.assertTrue(companyPage.playVideo.isEnabled());


    }

    @Given("User can display vacancy button by clicking {string} tab.")
    public void user_can_display_vacancy_button_by_clicking_tab(String button) {
        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();

        if (companyPage.Career.isDisplayed()) {
            companyPage.Career.click();
        }else {
            companyPage.More.click();
            companyPage.moreCareer.click();
        }

        //verify that User can display vacancy button
        companyPage.Vacancies.isDisplayed();

        //return the main page after clicking vacancies
     //   companyPage.mainPage.click();

    }

    @Then("User can display the news under Business News\\(RSS) menu.")
    public void user_can_display_the_news_under_Business_News_RSS_menu() {
        CompanyPage companyPage = new CompanyPage();
        companyPage.companyButton.click();

        BrowserUtils.waitFor(1);

        if (companyPage.Business_NewsRSS.isDisplayed()){
            companyPage.Business_NewsRSS.click();
        }else {
            companyPage.More.click();
            companyPage.moreBusiness_NewsRSS.click();
        }

        String expectedResult = "RSS Feed";
        String actualResult = companyPage.RSSFeed.getText();

        Assert.assertEquals(expectedResult,actualResult);


    }


    @When("User can not display News window by clicking on Add News button. It is not valid for {string} users.")
    public void userCanNotDisplayNewsWindowByClickingOnAddNewsButtonItIsNotValidForUsers(String userType) {

        CompanyPage companyPage =new CompanyPage();

        System.out.println("companyPage.isElementPresent() = " + companyPage.isElementPresent(By.xpath("(//span[@class='webform-small-button-text'])[2]")));
        Boolean ElementPresent = companyPage.isElementPresent(By.xpath("(//span[@class='webform-small-button-text'])[2]"));
               Assert.assertFalse(ElementPresent);

    }

    @And("User can not display Add News window by clicking on Add News button. It is not valid for {string} users.")
    public void userCanNotDisplayAddNewsWindowByClickingOnAddNewsButtonItIsNotValidForUsers(String userType) {

        CompanyPage companyPage =new CompanyPage();


        System.out.println("companyPage.isElementPresent() = " + companyPage.isElementPresent(By.xpath("//a[@class='ui-btn ui-btn-primary']")));

        Boolean ElementPresent = companyPage.isElementPresent(By.xpath("//a[@class='ui-btn ui-btn-primary']"));

        Assert.assertFalse(ElementPresent);

    }


    @Given("The user logged in as {string}")
    public void theUserLoggedInAs(String userType) {

        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equals("HR")){
            username = ConfigurationReader.get("HR_username");
            password = ConfigurationReader.get("HR_password");
        }else if(userType.equals("Helpdesk")){
            username = ConfigurationReader.get("Helpdesk_username");
            password = ConfigurationReader.get("Helpdesk_password");
        }else if(userType.equals("Marketing")){
            username = ConfigurationReader.get("Marketing_username");
            password = ConfigurationReader.get("Marketing_password");
        }


        BrowserUtils.waitFor(1);
        //send username and password and login
        new LoginPage().login(username,password);

    }
}
