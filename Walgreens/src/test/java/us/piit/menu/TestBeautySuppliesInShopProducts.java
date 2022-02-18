package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestBeautySuppliesInShopProducts extends CommonAPI {
    @Test
    public void BeautySuppliesInShopProducts(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.beautysuppliesbtn.isEnabled());
        homepage.beautySuppliesBtn();
        homepage.shopBeautyBtn();
        Assert.assertEquals(getTitle(),"Beauty Products | Walgreens");
    }
}
