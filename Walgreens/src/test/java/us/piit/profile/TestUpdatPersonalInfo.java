package us.piit.profile;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.ProfilPage;
import us.piit.SigninPage;

public class TestUpdatPersonalInfo extends CommonAPI {
    @Test
public void UpdatePersonalInformation(){
        HomePage homepage = new HomePage(driver);
        SigninPage signinpage = new SigninPage(driver);
        ProfilPage profilpage = new ProfilPage(driver);


        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnAccountBtn();
        homepage.clickOnSigninBtn();
        signinpage.typeCorrectEmail();
        signinpage.typeCorrectPassword();
        signinpage.clickSubmitbtn();
        profilpage.clickHiMaurice();
        //profilpage.getToAccountHome();
        profilpage.selectAccountHome();
        profilpage.hoverOverProfile();
        profilpage.clickPersonalInfo();
        Assert.assertTrue(profilpage.editionbtn.isEnabled());
        profilpage.clickOnEditionBtn();
        Assert.assertEquals(getTitle(), "Edit Personal Information | Walgreens");
        profilpage.selectGender();
        //profilpage.selectPhoneType();
        Assert.assertTrue(profilpage.savechangesbtn.isEnabled());
        profilpage.saveInfoChanges();








    }
}
