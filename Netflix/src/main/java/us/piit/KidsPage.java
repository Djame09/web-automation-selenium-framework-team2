package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsPage extends CommonAPI {
    public KidsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Kids']")
    WebElement kids;
    @FindBy(xpath = "(//p[@class='fallback-text'])[4]")
    WebElement avatar;
    public void clickKids() {click(kids);}
    public void hoverOverAvatar(WebDriver driver){
        hoverOver(driver,avatar);
    }


}


