package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPage extends CommonAPI {
    public LoginPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='authLinks redButton']")
    WebElement signIn;
    @FindBy(xpath = "//input[@id='id_userLoginId']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='id_password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[text()='Sign In']")
    WebElement signInButton;
    @FindBy(xpath = "//div[@class='ui-message-contents']")
    WebElement errorMessage;
    @FindBy(xpath = "(//li[@class='navigation-tab'])[2]")
    WebElement tvShows;
    @FindBy(xpath = "//span[@class='arrow']")
    WebElement genres;
    @FindBy(xpath = "(//ul[@class='sub-menu-list multi-column'])[1]")
    WebElement action;
    @FindBy(xpath = "(//span[@class='ltr-zd4xih'])[1]")
    WebElement play;
    @FindBy(xpath = "//div[@class='account-dropdown-button']")
    WebElement logAccount;
    @FindBy(xpath = "(//span[text()='Help Center'])[1]")
    WebElement helpCenter;
    @FindBy(xpath = "//a[text()='Plans and Pricing']")
    WebElement plansandpricing;
    @FindBy(xpath = "//div[@class='breadcrumb-container']")
    WebElement backtohelphome;
    @FindBy(xpath = "//a[text()='I received an email stating there was a new sign-in to my account']")
    WebElement ireceivedanemailstating;


    public void clickBackToHelpHome(){
        click(backtohelphome);
    }

    public void clickPlansAndPricing(){
    click(plansandpricing);
}
    public void clickIreceivedanemailstating(){click(ireceivedanemailstating);}

    public void getHelpCenter(){
        click(helpCenter);
    }


   public void hoverLogAccount(WebDriver driver){
    hoverOver(driver,logAccount);
}


    public void signInNetflix() {click(signIn);}

    public void typeEmailLogin() {
        type(emailField, "sofiane.boumali1983@gmail.com");
    }

    public void typePassword() {
        type(passwordField, "srboumali83");
    }

    public void clickSignInButton() {
        click(signInButton);
    }

   // public String getTextMessage(){
       // return getTextMessage();
    //}
    public void setTvShows(){
        click(tvShows);
    }
    public void clickGenres(){
        click(genres);
    }
    public void clickAction(){
        click(action);
    }
    public void clickPlay(){
        click(play);
    }
}



