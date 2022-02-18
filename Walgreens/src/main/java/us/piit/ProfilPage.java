package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilPage extends CommonAPI {
    public ProfilPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//strong[text()='Hi, Maurice']")
    public
    WebElement himauricebtn;
    @FindBy(xpath = "(//strong[text()='Sign Out'])[2]")
    WebElement signoutbtn;
    @FindBy(xpath = "//strong[text()='You are signed out. Thanks for visiting.']")
    WebElement loggedoutmessage;
    @FindBy(xpath = "(//span[@class='icon icon__arrow-down'])[2]")
    WebElement profiledropdownmenu;
    @FindBy(xpath = "(//a[text()='Account Home'])[2]")
    WebElement accounthomeoption;
    @FindBy(css = "#tab-one")
    WebElement profileoptions;
    @FindBy(xpath = "(//a[text()='Personal Information'])[1]")
    WebElement profilepersonalinformation;
    @FindBy(css = "#wag-edit-info-btm")
    public
    WebElement editionbtn;
    @FindBy(css = "#wag-infoedit-gender")
    WebElement choosegender;
    @FindBy(css = "wagph5878-wag-phonetype-select")
    WebElement phonetype;
    @FindBy(xpath = "(//span[text()='Save Changes'])[1]")
    public
    WebElement savechangesbtn;
    @FindBy(xpath = "(//a[text()='Payment Methods'])[1]")
    WebElement paymentmethosbtn;





    public void clickHiMaurice(){

        click(himauricebtn);
    }
    public void clickSignOut(){

        click(signoutbtn);
    }
    public String getLoggedOutText(){
       return getText(loggedoutmessage);
    }
    public void getToAccountHome(){
        selectDropdownOption(profiledropdownmenu, "Account Home");
    }
    public void selectAccountHome(){
        click(accounthomeoption);
    }
    public void hoverOverProfile(){
        hoverOver(driver, profileoptions);
    }
    public void clickPersonalInfo(){
        click(profilepersonalinformation);
    }
    public void clickOnEditionBtn(){
        click(editionbtn);
    }
    public void selectGender(){selectDropdownOption(choosegender, "Male");}
    public void selectPhoneType(){
        selectDropdownOption(phonetype, "Cell");
    }
    public void saveInfoChanges(){
        click(savechangesbtn);
    }
    public void addPaymentMethods(){click(paymentmethosbtn);}

}
