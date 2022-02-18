package us.piit.menu;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class TestPetSuppliesInShopProducts extends CommonAPI {
    @Test
    public void PetSuppliesInShopProducts(){
        HomePage homepage = new HomePage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.shopproductsbtn.isEnabled());
        homepage.shopProductsBtn();
        homepage.petDropDownbtn();
        Assert.assertTrue(homepage.catsuppliesbtn.isEnabled());
        homepage.catSuppliesBtn();
        homepage.catFoodBtn();
        Assert.assertEquals(getTitle(),"Cat Food | Walgreens");



    }
}
