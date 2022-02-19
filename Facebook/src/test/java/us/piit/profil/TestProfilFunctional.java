package us.piit.profil;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.ProfilPage;
import us.piit.HomePage;
import us.piit.LogInPage;

public class TestProfilFunctional extends CommonAPI {

     @Test
    public void testLogOut() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.clickOnAccountIcon();
        profilPage.clickOnLogOut();

    }

    @Test
    public void testFeedbackOption() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.clickOnAccountIcon();
        profilPage.clickOnFeedback();
        Assert.assertEquals(profilPage.getTextMassege(), "Give Feedback to Facebook");
        profilPage.clickOnSomethingWentWongIcon();
        Assert.assertEquals(profilPage.getText(), "Something went wrong");
        waitFor(5);
        profilPage.clickOnChooseAnAreaLink();
        //profilPage.scrollDownIntoView();
        profilPage.typeOnDetailsField();
        profilPage.clickOnSubmitButton();
    }

    @Test
    public void testGetHelp() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.clickOnAccountIcon();
        profilPage.clickOnhelpSupport();
        profilPage.clickOnhelpCenter();
        Assert.assertEquals(profilPage.getTextDisplayed(), "How can we help you?");
        profilPage.clickOnSearchField();
        profilPage.clickOnMarketOption();
        profilPage.acceptAlert();
        profilPage.typeTheDescription();
        profilPage.clickOnSubmitButton();
    }

    @Test
    public void testChangeLangauge() {
        LogInPage loginPage = new LogInPage(driver);
        loginPage.signInWithValidCredentials();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnHomePage();
        ProfilPage profilPage = new ProfilPage(driver);
        profilPage.clickOnAccountIcon();
        profilPage.clickOnSettingPrivacy();
        profilPage.clickOnLanguageOption();
        Assert.assertEquals(profilPage.getProfilePageTitle(), "(2) Facebook");
        profilPage.clickOnEditLink();
        profilPage.selectDropdownLanguage("Deutsch");
        profilPage.clickOnSaveChanges();

    }
}