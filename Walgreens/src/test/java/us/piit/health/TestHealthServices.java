package us.piit.health;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.ServicesPage;

public class TestHealthServices extends CommonAPI {
    @Test
    public  void HealthServices(){
        HomePage homepage = new HomePage(driver);
        ServicesPage servicepage = new ServicesPage(driver);

        Assert.assertEquals(getTitle(), "Walgreens: Pharmacy, Health & Wellness, Photo & More for You");
        homepage.ScrollToViewService();
        homepage.seeHealthServices();
        Assert.assertEquals(getTitle(), "Find Care | Services | Walgreens");
        servicepage.painManagementServices();
        servicepage.getStartedBtn();

    }
}
