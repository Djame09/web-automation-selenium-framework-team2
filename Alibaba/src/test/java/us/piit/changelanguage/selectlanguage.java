package us.piit.changelanguage;

import base.CommonAPI;
import org.apache.commons.math3.ode.ContinuousOutputModel;
import org.testng.annotations.Test;
import us.piit.HomePage;

import java.util.HashMap;

public class selectlanguage extends CommonAPI {
    @Test
    public void changelanguageselection(){
        HomePage homePage= new HomePage(driver);
        homePage.hoveroverlanguage(driver);
       // waitFor(5);
        homePage.selectlanguage();
    }
}
