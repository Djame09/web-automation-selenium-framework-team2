package us.piit.search;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.GroupsPage;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestFindGroup extends CommonAPI {

    @Test
    public void testFindGroup(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        GroupsPage groupsPage = new GroupsPage(driver);
        groupsPage.clickOnGroupsIcon();
        groupsPage.clickOnSearchIcon();
        groupsPage.typeOnSearchField();
        groupsPage.clickOnTypedName();
        groupsPage.hoverOverGroupeName(driver);


    }
}
