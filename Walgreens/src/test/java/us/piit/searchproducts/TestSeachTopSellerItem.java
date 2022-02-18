package us.piit.searchproducts;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.ProductsPage;

public class TestSeachTopSellerItem extends CommonAPI {
    @Test
    public void SearchItem() {
        HomePage homepage = new HomePage(driver);
        ProductsPage productpage = new ProductsPage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.typeOnHomeSearchBar();
        Assert.assertTrue(homepage.searchbtn.isEnabled());
        homepage.clickOnSearchBtn();
        Assert.assertEquals(getTitle(), "water | Walgreens");
        productpage.TopSellerWater();



    }

}
