package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class LoginPage extends CommonAPI {
    public LoginPage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='fm-login-id']")
    WebElement UserName;
    @FindBy(xpath = "//input[@id='fm-login-password']")
    WebElement Password;
    @FindBy(xpath = "//input[@id='fm-login-submit']")
    WebElement LogInSubmit;
    @FindBy(xpath = "//div[@id='nc_1__scale_text']")
    WebElement sliderButton;


    public String getLoginPageTitle(){
        return getTitle();
    }
    public void inssertEmail() {
        type(UserName,"helloefromme21@gmail.com");

    }
    public void inssertPassword(){
        type(Password,"hellow3221@");
    }
    public void cliclSubmit(){
        click(LogInSubmit);
    }
    public void slideButtonToRight(){
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(sliderButton,318 , 0).perform();

    }
    public void inssertEmail1() {
        type(UserName,"jamesheadson2@gmail.com");

    }
    public void inssertPassword1(){
        type(Password,"Halloumi20$");
    }
    public void cliclSubmit1(){
        click(LogInSubmit);
    }

    public void slideButtonToRight1(){
    Actions builder = new Actions(driver);

////    builder.dragAndDropBy(sliderButton,318 , 0).perform();
////    public void slideButtonToLeft1(){
//        Actions builder = new Actions(driver);
////        builder.moveToElement(sliderButton)
////                .click()
////                .dragAndDropBy
////                        (sliderButton,318 , 0)
////                .build()
////                .perform();

    }

}
