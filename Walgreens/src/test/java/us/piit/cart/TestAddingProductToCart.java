package us.piit.cart;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.ProductsPage;

public class TestAddingProductToCart extends CommonAPI {
    @Test
    public void AddProductToCart(){
        HomePage homepage = new HomePage(driver);
        ProductsPage productpage = new ProductsPage(driver);

        homepage.typeOnHomeSearchBar();
        homepage.clickOnSearchBtn();
        productpage.ScrollToDesiredProduct();
        productpage.DesiredToGetWater();
        productpage.AddToCart();
        Assert.assertEquals(productpage.getCartText(), "1 Item added to your cart for pickup at store");


    }
}
