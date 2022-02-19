package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenter extends CommonAPI {
    public HelpCenter(WebDriver driver) {
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
    @FindBy(xpath = "(//span[text()='Help Center'])[1]")
    WebElement helpCenter;
    @FindBy(xpath = "(//li[@class='top-article'])[3]")
    WebElement howtochangeyourplan;
    @FindBy(xpath = "(//li[@class='top-article'])[4]")
    WebElement howtostopsomeonefromusingyouraccount;
    @FindBy(xpath = "(//li[@class='top-article'])[5]")
    WebElement netflixsays;
    @FindBy(xpath = "(//li[@class='top-article'])[6]")
    WebElement troubleshoot;
    @FindBy(xpath = "(//li[@class='top-article'])[7]")
    WebElement billingandpayments;
    @FindBy(xpath = "(//li[@class='top-article'])[8]")
    WebElement netflixsaysyouraccountisonhold;
    @FindBy(xpath = "(//li[@class='top-article'])[9]")
    WebElement netflixgiftcards;
    @FindBy(xpath = "(//li[@class='top-article'])[10]")
    WebElement howtocreateandeditprofiles;
    @FindBy(xpath = "(//li[@class='top-article'])[11]")
    WebElement howtowatchnetflixonyourtv;
    @FindBy(xpath = "(//li[@class='top-article'])[12]")
    WebElement howtodownloadtitlestowatchoffline;



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
    public void getHelpCenter(){
        click(helpCenter);
    }
    public void clickHowToChangeYourPLan(){click(howtochangeyourplan);}
    public void clickHowToStopSomeoneFromUsingYourAccount(){click(howtostopsomeonefromusingyouraccount);}
    public void clickNetflixSays(){click(netflixsays);}
    public void clickTroubleShoot(){click(troubleshoot);}
    public void clcickBillingAndPayments(){click(billingandpayments);}
    public void clickNetflixSaysYourAccountIsOnHold(){click(netflixsaysyouraccountisonhold);}
    public void clickNetflixGiftCards(){click(netflixgiftcards);}
    public void clickHowtocreateandeditprofiles(){click(howtocreateandeditprofiles);}
    public void clickHowToWatchNetflixOnYourTv(){click(howtowatchnetflixonyourtv);}
    public void clickhowtodownloadtitlestowatchoffline(){click(howtodownloadtitlestowatchoffline);}

    }


