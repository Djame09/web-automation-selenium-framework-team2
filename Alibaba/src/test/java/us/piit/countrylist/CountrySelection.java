package us.piit.countrylist;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class CountrySelection extends CommonAPI {

    @Test
    public void selectshipcountry(){
        HomePage homePage=new HomePage(driver);
        homePage.getshipto(driver);
        homePage.getcountry();
//        homePage.countryname();
    }
}
