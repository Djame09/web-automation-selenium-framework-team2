package us.piit.cart;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.CartPage;
import us.piit.HomePage;
import us.piit.ProductsPage;

public class TestRemoveProductFromCart extends CommonAPI {
    @Test
    public void RemoveProductFromCart(){
        HomePage homepage = new HomePage(driver);
        ProductsPage productpage = new ProductsPage(driver);
        CartPage cartpage = new CartPage(driver);


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.typeOnHomeSearchBar();
        homepage.clickOnSearchBtn();
        productpage.ScrollToDesiredProduct();
        productpage.DesiredToGetWater();
        productpage.AddToCart();
        productpage.GoToCart();
        cartpage.removeCartItem();
        Assert.assertEquals(cartpage.getEmptyCartText(), "Your Cart is empty");

    }
}
