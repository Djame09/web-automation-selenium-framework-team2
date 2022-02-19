package us.piit.game;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.GamingVideo;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestGameVideos extends CommonAPI {
    //@Test
    public void TestSolitaireGameVideo() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        homePage.clickOnMenu();
        GamingVideo gamingVideo=new GamingVideo(driver);
        gamingVideo.clickOnGamingVideo();
        Assert.assertEquals(gamingVideo.getGamingVideoTitle(), "Facebook");
        gamingVideo.scrollDownIntoView();
        gamingVideo.clickOnSolitaiteGame();

    }
}