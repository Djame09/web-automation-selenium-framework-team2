package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestVitaminesInShopProduct extends CommonAPI {
    @Test
    public void PersonalCare(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.vitamiesandsupplements.isEnabled());
        homepage.vitaminesAndSupplements();
        Assert.assertTrue(homepage.vitaminesbtn.isEnabled());
        homepage.vitaminesBtn();
        homepage.mensVitaminesBtn();
        Assert.assertEquals(getTitle(), "Multivitamins for Him | Walgreens");


    }
}
