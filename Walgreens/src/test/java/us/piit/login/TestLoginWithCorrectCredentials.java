package us.piit.login;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.SigninPage;

public class TestLoginWithCorrectCredentials extends CommonAPI {
    @Test
    public void  loginWithCorrectCredentials(){
        HomePage homepage = new HomePage(driver);
        SigninPage signinpage = new SigninPage(driver);

        homepage.clickOnAccountBtn();
        homepage.clickOnSigninBtn();
        signinpage.typeCorrectEmail();
        signinpage.typeCorrectPassword();
        signinpage.clickSubmitbtn();
        Assert.assertEquals(signinpage.getGreetingText(), "Hi, Maurice");
    }
}
