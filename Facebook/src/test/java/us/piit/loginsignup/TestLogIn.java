package us.piit.loginsignup;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.LogInPage;
import utility.GetProperties;

import java.util.Properties;

public class TestLogIn extends CommonAPI {

   // @Test
    public void testSignInWithValidCredentials() {
        LogInPage loginPage = new LogInPage(driver);

        waitFor(3);
        loginPage.signInWithValidCredentials();
        String expectedText="Facebook - Log In or Sign Up";
        String actualText =loginPage.getLoginPageTitle();
        Assert.assertEquals(actualText, expectedText,"Welcome to Facebook, Amar");
        waitFor(3);

        //Assert.assertEquals(loginPage.getLoginPageTitle(), "Facebook");
        //Assert.assertEquals(actualText, expectedText,"the text did not match");
    }
    //@Test(enabled = true)
    public void signInWithInvalidPassword() {
        LogInPage loginPage = new LogInPage(driver);
        Properties prop = GetProperties.loadProperties("src/test/resources/config.properties");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        loginPage.signInWithInvalidCredentials();
        Assert.assertEquals(loginPage.getTextMassege(),"The password you’ve entered is incorrect. Forgot Password?");
        waitFor(3);
    }


}



