package us.piit.message;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LoginPage;
import utility.GetProperties;

import java.util.Properties;

public class WriteMessage extends CommonAPI {
    Properties prop = GetProperties.loadProperties("src/test/resources/config.properties");
    String username = prop.getProperty("username");
    String password = prop.getProperty("password");
    @Test
    public void sendmessage(){
        HomePage homePage=new HomePage(driver);
        LoginPage loginPage=new LoginPage(driver);
        homePage.hoveoverMessages(driver);
        homePage.singINMessage();
        loginPage.inssertEmail1();
        loginPage.inssertPassword1();
        loginPage.cliclSubmit1();
       // Assert.assertEquals(getTitle(),"Alibaba Manufacturer Directory - Suppliers, Manufacturers, Exporters & Importers");

    }
}
