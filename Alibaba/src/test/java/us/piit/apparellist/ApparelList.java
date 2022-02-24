package us.piit.apparellist;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class ApparelList extends CommonAPI {
    @Test
    public void ApparelElement(){
        HomePage homePage=new HomePage(driver);
        homePage.getApparel(driver);
        homePage.getmensclothing();
    }



}
