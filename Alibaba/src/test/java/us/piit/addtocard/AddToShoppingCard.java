package us.piit.addtocard;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.LencePage;
import us.piit.LoginPage;
import us.piit.ReadyToShipPage;
import utility.GetProperties;

import java.util.Properties;

public class AddToShoppingCard extends CommonAPI {
    Properties prop = GetProperties.loadProperties("src/test/resources/config.properties");
    String username = prop.getProperty("username");
    String password = prop.getProperty("password");
@Test
    public void shoppingLences(){
    HomePage homePage=new HomePage(driver);
    ReadyToShipPage readytoshipage=new ReadyToShipPage(driver);
    LencePage lencepage=new LencePage(driver);
    LoginPage loginpage=new LoginPage(driver);
    homePage.alibabaTab();
    readytoshipage.cliclLences();
    lencepage.AddlenceQuantity();
    lencepage.clickToAddToCard();
    loginpage.inssertEmail1();
    loginpage.inssertPassword1();
    loginpage.cliclSubmit1();
    waitFor(4);



}


}
