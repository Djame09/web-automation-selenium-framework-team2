package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PharmacyChatPage extends CommonAPI {
    public PharmacyChatPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#ChatButton")
    WebElement chatnowbtn;
    @FindBy(xpath = "//textarea[@class='webchat__auto-resize-textarea__textarea webchat__send-box-text-box__html-text-area']")
    public
    WebElement inputmessagefield;





    public void chatNowBtn(){
        click(chatnowbtn);
    }
    public void inputMessageField(){
        type(inputmessagefield, "is the pharmacy open on week ends?");
    }
}
