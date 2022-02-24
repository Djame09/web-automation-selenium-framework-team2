package us.piit.bathromlist;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.HomeGardenPage;
import us.piit.HomePage;

public class BathroomProductList extends CommonAPI {
    @Test
    public void bathroomproduct(){
        HomePage homePage=new HomePage(driver);
        HomeGardenPage homeGardenPage=new HomeGardenPage(driver);
        homePage.hoverOverCategories(driver);

        homePage.alibabaTab1();
        homeGardenPage.bathromproductlist();


    }
}
