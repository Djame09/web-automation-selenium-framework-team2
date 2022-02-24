package us.piit.buyercentral;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class BuyerCentralList extends CommonAPI {
    @Test
    public void buyercentralelement(){
        HomePage homePage=new HomePage(driver);
        homePage.buyercentrallist(driver);
        waitFor(5);

    }
}
