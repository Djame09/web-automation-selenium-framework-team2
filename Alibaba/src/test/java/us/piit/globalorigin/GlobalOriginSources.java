package us.piit.globalorigin;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.HomePage;


public class GlobalOriginSources extends CommonAPI {
    @Test
    public void globalelement(){
        HomePage homePage=new HomePage(driver);
        homePage.getglobaloriginsources();
        homePage.clickGlobalorigin();
    }

}