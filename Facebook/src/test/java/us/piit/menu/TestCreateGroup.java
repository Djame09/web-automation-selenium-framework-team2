package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestCreateGroup extends CommonAPI {
   @Test
    public void createGroup() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.clickOnTheLinkGroup();
        Assert.assertEquals(homePage.getHomePageTitle(),"Facebook");
        homePage.typeGroupName();
        homePage.clickOnChoosePrivacy();
        homePage.clickOnpublicOption();
        homePage.clickOnButtonCreate();

    }
}