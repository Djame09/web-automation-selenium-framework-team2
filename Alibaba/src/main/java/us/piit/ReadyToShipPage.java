package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadyToShipPage extends CommonAPI {
public ReadyToShipPage(WebDriver driver){
    super.driver=driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//div[text()='Modern 0.45X Wide Angle Macro Mobile Lence Phone Camera Lens']")
    WebElement lences;


public void cliclLences(){
    click(lences);
}

}
