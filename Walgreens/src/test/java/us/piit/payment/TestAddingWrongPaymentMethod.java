package us.piit.payment;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.PaymentInformationPage;
import us.piit.ProfilPage;
import us.piit.SigninPage;

public class TestAddingWrongPaymentMethod extends CommonAPI {
    @Test
    public void AddingPaymentMethod(){
        HomePage homepage = new HomePage(driver);
        SigninPage signinpage = new SigninPage(driver);
        ProfilPage profilpage = new ProfilPage(driver);
        PaymentInformationPage paymentinformationpage= new PaymentInformationPage(driver);


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnAccountBtn();
        Assert.assertTrue(homepage.signinbtn.isEnabled());
        homepage.clickOnSigninBtn();
        signinpage.typeCorrectEmail();
        signinpage.typeCorrectPassword();
        Assert.assertTrue(signinpage.submitebtn.isEnabled());
        signinpage.clickSubmitbtn();
        Assert.assertTrue(profilpage.himauricebtn.isEnabled());
        profilpage.clickHiMaurice();
        profilpage.selectAccountHome();
        Assert.assertEquals(getTitle(), "Your Account | Walgreens");
        profilpage.hoverOverProfile();
        profilpage.addPaymentMethods();
        Assert.assertEquals(getTitle(), "Payment Information");
        paymentinformationpage.addPaymentMethodsBtn();
        paymentinformationpage.creditCardNumber();
        paymentinformationpage.cardSecurityCode();
        paymentinformationpage.billingStreetAddress();
        paymentinformationpage.billingCity();
        paymentinformationpage.ChooseState();
        paymentinformationpage.zipCodeField();
        Assert.assertTrue(paymentinformationpage.savecardinfobtn.isDisplayed());





    }


}
