package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.CommandLineArgs;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestHomeHealthCareInShopProducts extends CommonAPI {
    @Test
    public void HomeHealthCare() {
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.homehealthcarebtn.isEnabled());
        homepage.homeHealthCareBtn();
        homepage.homeTestBtn();
        homepage.atHomeCovidTestBtn();
        Assert.assertEquals(getTitle(), "At Home Covid Tests – Rapid Antigen & PCR Test Kits | Walgreens");

    }
}