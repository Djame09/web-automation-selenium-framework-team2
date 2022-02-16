package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AppTest extends CommonAPI {

  // @Test
    public void categoriesList(){
        HomePage homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.hoverOverCategories(driver);



    }



}
