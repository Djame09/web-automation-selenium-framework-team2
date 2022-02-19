package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestMedicinesInShopProducts extends CommonAPI {
    @Test
    public void MedicinesInShopProduct(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        Assert.assertTrue(homepage.medicinesandtreatmentsbnt.isEnabled());
        homepage.medicinesAndTreatmentBtn();
        homepage.CoughColdFlu();
        homepage.adultColdRemedies();
        Assert.assertEquals(getTitle(),"Adult Cold Remedies | Walgreens");



    }
}
