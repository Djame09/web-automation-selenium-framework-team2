package us.piit.marketplace;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LogInPage;
import us.piit.MarketPlacePage;

public class TestMarketPlace extends CommonAPI {

    @Test
    public void TestSelectItemOnMarketPlace(){
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage=new HomePage(driver);
        homePage.clickOnHomePage();
        MarketPlacePage marketPlacePage=new MarketPlacePage(driver);
        marketPlacePage.scrollDownIntoView();
        marketPlacePage.clickOnMarketPlace();
        Assert.assertEquals(marketPlacePage.getTextMassege(),"Marketplace");
        marketPlacePage.typeItemToSearch();

    }

}
