package us.piit.coupons;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.CouponsPage;
import us.piit.HomePage;
import us.piit.ProfilPage;
import us.piit.SigninPage;

public class TestCouponsOptions extends CommonAPI {
    @Test
    public  void CouponsOptionsvailability(){
        HomePage homepage = new HomePage(driver);
        CouponsPage couponpage = new CouponsPage(driver);


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnHomeMenu();
        Assert.assertTrue(homepage.couponsbtn.isEnabled());
        homepage.clickOnCouponsBtn();
        Assert.assertEquals(getTitle(), "Paperless Coupons | Walgreens");
        couponpage.selectCouponsCategory();
        couponpage.clipSelectedCoupon();
        Assert.assertEquals(couponpage.getCouponMembershipInfo(), "Enter your membership info to clip coupons.");



    }
}
