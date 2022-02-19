package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestCreateEvent extends CommonAPI {
    @Test
    public void createEvent() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        homePage.clickOnEventLink();
        Assert.assertEquals(homePage.getHomePageTitle(),"Facebook");
        homePage.clickOnInPersonOption();
        homePage.typeEventName();
        waitFor(5);
        homePage.clickOnStartDayEvent();
        homePage.clickOnStarTimeEvent();
        homePage.clickOnEndDayEvent();
        homePage.clickOnEndTimeEvent();
        homePage.clickOnChoosePrivacy();
        homePage.clickOnPrivateEvent();
        homePage.clickOnNextButton();
        homePage.typeLocationEvent();
        homePage.typeDescriptionEvent();
        homePage.clickOnCreateEvent();

    }

}
