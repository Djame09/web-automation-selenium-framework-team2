package us.piit.scrolldownto;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import us.piit.HomePage;

public class ScrollDownToNewArrivals extends CommonAPI {
    @Test
    public void scrollDownToNewArrivales(){
        HomePage homePage=new HomePage(driver);
        homePage.scrolldowntoelement();
        waitFor(10);
      //Assert.assertEquals(getTitle(),"Top-ranking Products");

    }


}
