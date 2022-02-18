package us.piit.sendrequest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class SendRequestitems extends CommonAPI {
    @Test
    public void requestitems(){
        HomePage homePage=new HomePage(driver);
        homePage.scrollrequest();
        waitFor(3);
        homePage.typerequestitems();
        homePage.numberofitems();
        homePage.clickrequest();
        Assert.assertEquals(getTitle(),"Manufacturers, Suppliers, Exporters;Importers from the largest online B2B marketplace-Alibaba.com and from other B2B, B2C markets.");

    }
}
