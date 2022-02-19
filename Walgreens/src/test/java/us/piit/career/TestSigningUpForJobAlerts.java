package us.piit.career;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.CareerPage;
import us.piit.HomePage;
import zmq.socket.pubsub.Pub;

public class TestSigningUpForJobAlerts extends CommonAPI {
    @Test
    public void SigningUpForJobAlerts(){
        HomePage homepage = new HomePage(driver);
        CareerPage careerpage= new CareerPage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.scrollToViewCarrer();
        Assert.assertTrue(homepage.careerbtn.isEnabled());
        homepage.clickOnCareerBtn();
        Assert.assertTrue(careerpage.nothanksbtn.isEnabled());
        careerpage.noThanksBtn();
        Assert.assertEquals(getTitle(), "Working at WALGREENS");
        careerpage.scrollTosubmitBtn();
        Assert.assertTrue(careerpage.submitbtn.isEnabled());
        careerpage.lastNameField();
        careerpage.firstNameField();
        careerpage.emailField();
        careerpage.selectJobCategory();
        waitFor(3);
        careerpage.clickSubmitBtn();







    }
}
