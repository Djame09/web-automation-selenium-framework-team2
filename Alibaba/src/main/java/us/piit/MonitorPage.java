package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorPage extends CommonAPI {
    public MonitorPage(WebDriver driver){
        super.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//span[@class='seb-checkbox__inner-icon'])[5]")
    WebElement paidsimplecheck;
    @FindBy(xpath = "(//span[@class='seb-checkbox__inner-icon'])[8]")
    WebElement countrysupplycheck;
    @FindBy(xpath = "//body/div[4]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[24]/div[1]/div[2]/div[1]/h2[1]/a[1]/p[1]")
    WebElement selectedMonitor;
    @FindBy(xpath = "(//span[@class='ui2-checkbox-customize-txt'])[23]")
    WebElement compareButton;


    public void getcompar(){
        click(compareButton);
    }

public void scrolltoMonitor(){
    scrollToView(selectedMonitor);

}
    public void getcountrysupply(){
        click(countrysupplycheck);
    }
    public void checkbox(){
        click(paidsimplecheck);
    }
}
