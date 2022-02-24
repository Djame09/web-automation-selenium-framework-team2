package us.piit.switchtab;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class SwitchTabAlibaba extends CommonAPI {


@Test
    public void readyToShip(){
    HomePage homePage = new HomePage(driver);
    homePage.alibabaTab();
    Assert.assertEquals(getTitle(),"Ready to Ship");
}
    @Test
    public void categoriesList() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverCategories(driver);
        homePage.alibabaTab();
      Assert.assertEquals(getTitle(), "Ready to Ship");

    }

}
