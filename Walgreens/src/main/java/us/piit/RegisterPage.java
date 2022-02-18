package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonAPI {
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="#wag-RXUser-firstname")
    WebElement firstnamefield;
    @FindBy(css="#wag-RXUser-lastname")
    WebElement lastnamefield;
    @FindBy(css="#wag-email")
    WebElement emailfield;
    @FindBy(css="#wag-password")
    WebElement passwordfield;
    @FindBy(css="#wag-terms-checkbox")
    WebElement readandagreeterms;
    @FindBy(css="#wag-rxuser-continue-btm")
    WebElement continuebtn;






    public void typeFirstName(){
        type(firstnamefield, "Maurice");
    }
    public void typeLastName(){
        type(lastnamefield, "TESTER");
    }
    public void typeEmail(){
        type(emailfield, "maurice.tester19@gmail.com");
    }
    public void typePassword(){
        type(passwordfield, "Emailfortesting18@testing");
    }
    public void checkReadAgreeTerms(){
        click(readandagreeterms);
    }
    public void clickContinueBtn(){
        click(continuebtn);
    }


}

