package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends CommonAPI {
    public SigninPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css="#user_name")
    WebElement emailusernamefield;
    @FindBy(css="#user_password")
    WebElement password;
    @FindBy(css="#submit_btn")
    public
    WebElement submitebtn;
    @FindBy(css="#error_msg")
    WebElement errormessage;
    @FindBy(css="#user_name")
    WebElement correctemail;
    @FindBy(css="#user_password")
    WebElement correctpassword;
    @FindBy(xpath="//strong[text()='Hi, Maurice']")
    WebElement greetingsmessage;
    @FindBy(xpath = "//span[@id='wag-email-res-error-msg']/ul/li[1]")
    WebElement errorexistingemail;





    public void typeEmailUsername(){
        type(emailusernamefield, "rachid.test@gmail.com");
    }
    public void typePassword(){
        type(password, "maybenotcorrect@");
    }
    public void clickSubmitbtn(){
        click(submitebtn);
    }
    public void typeCorrectEmail(){type(correctemail, "maurice.tester18@gmail.com");}
    public void typeCorrectPassword(){type(correctpassword, "Emailfortesting18@testing");}


    public String getText(){
        return getText(errormessage);
    }
    public String getGreetingText(){
        return getText(greetingsmessage);
    }
   // public String getExistingEmailMsg(){return getText(errorexistingemail);}
}
