package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {
    @FindBy(xpath = "//input[@id='fm-login-id']")
    WebElement UserName;
    @FindBy(xpath = "//dd[@id='fm-login-password-wrap']")
    WebElement Password;
    @FindBy(xpath = "//input[@id='fm-login-submit']")
    WebElement LogInSubmit;

    public void logInwithfalscorditionals() {

    }
}
