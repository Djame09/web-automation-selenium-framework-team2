package us.piit.loging;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LoginPage;
import utility.GetProperties;

import java.util.Properties;

public class LogInWithRightCredentials extends CommonAPI {
    Properties prop = GetProperties.loadProperties("src/test/resources/config.properties");
    String username = prop.getProperty("username");
    String password = prop.getProperty("password");
    @Test
    public void loginWithInvalidEmail() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.hoverOverSingIn(driver);
        homePage.singInbutton();
        loginPage.inssertEmail1();
        loginPage.inssertPassword1();
        // loginPage.slideButtonToRight1();
        loginPage.cliclSubmit1();
        waitFor(5);
    }
}
