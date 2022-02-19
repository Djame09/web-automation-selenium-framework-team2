package us.piit.loginpage;

import base.CommonAPI;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import us.piit.*;

public class TestLoginPage extends CommonAPI {

    @Test
    public void testSigninWithInvalidPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        //Assert.assertEquals(loginPage.getTextMessage(), "Incorrect password. Please try again or you can reset your password.");
    }

    @Test
    public void testSignInWithValidPassWord(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
    }

   @Test
    public void movieTitle(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        homePage.setIconSearchButton();
        waitFor(2);
       homePage.setSearchMovie("ozark");
        //waitFor(4);

    }
    @Test
    public void tvShow(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.setTvShows();
        waitFor(2);
        loginPage.clickGenres();
        loginPage.clickAction();
        loginPage.clickPlay();
    }
    @Test
            public void manageMyAccount(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);

    }
    @Test
    public void planAndPricing(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        loginPage.clickPlansAndPricing();
        loginPage.clickBackToHelpHome();

    }
    @Test
    public void clickMovies(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        MoviesPage moviesPage = new MoviesPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        moviesPage.clickMovies();
        moviesPage.clickGenres();
        moviesPage.clickDocumentaries();
        waitFor(2);
        moviesPage.scrollDocumentaries();
        moviesPage.hoverOverAmericanMurder(driver);
        waitFor(2);
        moviesPage.clickAmericanMurder();
    }

    @Test
            public void clickKids() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        KidsPage kidsPage = new KidsPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        kidsPage.clickKids();
        waitFor(2);
        kidsPage.hoverOverAvatar(driver);
        //kidsPage.clickMoreInfo();
       // kidsPage.clickClose();
    }

    @Test
    public void clickIreceivedanemailstating(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        loginPage.clickIreceivedanemailstating();
        loginPage.clickBackToHelpHome();
        waitFor(3);

    }
    @Test
    public void clickHowToChangeYourPlan(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowToChangeYourPLan();
        waitFor(2);
    }
    @Test
    public void clickHowToStopSomeoneFromUsingYourAccount(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowToStopSomeoneFromUsingYourAccount();

    }
    @Test
    public void clickNetflixSays(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickNetflixSays();
    }
    @Test
    public void clickTroubleShoot(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickTroubleShoot();
    }
    @Test
    public void clickBillingAndPayments(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clcickBillingAndPayments();
    }
    @Test
    public void clickNetflixSaysYourAccountIsOnHold(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickNetflixSaysYourAccountIsOnHold();

    }
    @Test
    public void clickNetflixGiftCards(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickNetflixGiftCards();

    }
    @Test
    public void clickHowtocreateandeditprofiles(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowtocreateandeditprofiles();

    }
    @Test
    public void clickHowToWatchNetflixOnYourTv(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickHowToWatchNetflixOnYourTv();
    }
    @Test
    public void clickhowtodownloadtitlestowatchoffline(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HelpCenter helpCenter = new HelpCenter(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homePage.setSofAccount();
        waitFor(3);
        loginPage.hoverLogAccount(driver);
        waitFor(3);
        loginPage.getHelpCenter();
        waitFor(2);
        helpCenter.clickhowtodownloadtitlestowatchoffline();
    }
    @Test
    public void HoverOverMyList(){
        HomePage homepage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signInNetflix();
        loginPage.typeEmailLogin();
        loginPage.typePassword();
        loginPage.clickSignInButton();
        waitFor(2);
        homepage.setSofAccount();
        waitFor(3);
        homepage.HoverOverMyList();
        waitFor(4);
    }




}

















