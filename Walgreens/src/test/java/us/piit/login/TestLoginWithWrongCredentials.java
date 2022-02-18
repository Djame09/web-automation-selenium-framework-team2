package us.piit.login;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.SigninPage;

public class TestLoginWithWrongCredentials extends CommonAPI {
    @Test
    public void loginWithWrongCredentials(){
        HomePage homepage = new HomePage(driver);
        SigninPage signinpage = new SigninPage(driver);

        homepage.clickOnAccountBtn();
        homepage.clickOnSigninBtn();
        signinpage.typeEmailUsername();
        signinpage.typePassword();
        signinpage.clickSubmitbtn();
        Assert.assertEquals(signinpage.getText(), "We didn’t recognize that username or password. Please try again.");

    }
}
