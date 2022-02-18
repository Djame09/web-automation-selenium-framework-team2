package us.piit.facebooklink;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class FacebookIconClick extends CommonAPI {
    @Test
    public void facebookClick(){
        HomePage homePage=new HomePage(driver);
        homePage.getfacebook();
    }
}
