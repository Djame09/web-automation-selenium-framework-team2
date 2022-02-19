package us.piit.search;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.FriendsPage;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestSearch extends CommonAPI {
    @Test
    public void testsearchFriend() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        FriendsPage friendsPage = new FriendsPage(driver);
        friendsPage.typeName();
        Assert.assertEquals(friendsPage.getFriendsPageTitle(),"Facebook");
        waitFor(3);
        friendsPage.hoverOverImageName(driver);
        waitFor(3);
        //friendsPage.clickaddfriend();


    }
    @Test
    public void testDropDown(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        homePage.selectFromDropDownMenu();

    }
}
