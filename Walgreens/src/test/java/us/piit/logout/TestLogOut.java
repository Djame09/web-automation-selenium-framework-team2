package us.piit.logout;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.ProfilPage;
import us.piit.SigninPage;

public class TestLogOut extends CommonAPI {
    @Test
    public void logOut(){
        HomePage homepage = new HomePage(driver);
        SigninPage signinpage = new SigninPage(driver);
        ProfilPage profilpage = new ProfilPage(driver);

        homepage.clickOnAccountBtn();
        homepage.clickOnSigninBtn();
        signinpage.typeCorrectEmail();
        signinpage.typeCorrectPassword();
        signinpage.clickSubmitbtn();
        profilpage.clickHiMaurice();
        profilpage.clickSignOut();
        Assert.assertEquals(profilpage.getLoggedOutText(), "You are signed out. Thanks for visiting.");



    }
}
