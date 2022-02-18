package us.piit.signup;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.RegisterPage;
import us.piit.SigninPage;

public class TestCreateAccount extends CommonAPI {

    @Test
    public void createAnAccount(){
        HomePage homepage = new HomePage(driver);
        RegisterPage registerpage = new RegisterPage(driver);


        homepage.clickOnAccountBtn();
        homepage.clickOnRegisterBtn();
        registerpage.typeFirstName();
        registerpage.typeLastName();
        registerpage.typeEmail();
        registerpage.typePassword();
        registerpage.checkReadAgreeTerms();
        registerpage.clickContinueBtn();
        //Assert.assertEquals(SigninPage.getExistingEmailMsg(), "Register with a different email address or ");


    }


}


