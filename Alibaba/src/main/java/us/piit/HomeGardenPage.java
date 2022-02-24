package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class HomeGardenPage extends CommonAPI {
    public HomeGardenPage(WebDriver driver){
        super.driver=driver;
                PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Bath Pillows')]")
    WebElement Bathroompillow;
    public void bathromproductlist(){
        click(Bathroompillow);

    }

}
