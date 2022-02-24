package us.piit.checkbox;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.MonitorPage;

public class CheckBox extends CommonAPI {
    @Test
    public void checkBoxInMonitorpage(){
        HomePage homePage=new HomePage(driver);
        MonitorPage monitorPage=new MonitorPage(driver);
        homePage.searchelements("monitor");
        Assert.assertEquals(getTitle(),"Monitor-Monitor Manufacturers, Suppliers and Exporters on Alibaba.comTouch Screen Monitors");
        monitorPage.checkbox();
        monitorPage.getcountrysupply();
    }



}
