package us.piit.chat;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.PharmacyChatPage;

public class TestPharmacyChat extends CommonAPI {
    @Test
    public void PharmacyChat(){
        HomePage homepage = new HomePage(driver);
        PharmacyChatPage pharmacychatpage= new PharmacyChatPage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.clickOnPharmacyChatBtn();
        Assert.assertEquals(getTitle(), "Pharmacy Chat | Walgreens");
        pharmacychatpage.chatNowBtn();
        Assert.assertTrue(pharmacychatpage.inputmessagefield.isEnabled());
        pharmacychatpage.inputMessageField();
    }
}
