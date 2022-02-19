package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestCreateStory extends CommonAPI {

    @Test(enabled =false)
    public void createStory(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.createStory();
        Assert.assertEquals(loginPage.getLoginPageTitle(), "Create Stories | Facebook");
    }




}
