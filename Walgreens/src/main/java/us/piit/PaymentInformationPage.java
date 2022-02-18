package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage extends CommonAPI {
    public PaymentInformationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Add payment']")
    WebElement addpaymentbtn;
    @FindBy(css = "#new-paymentcard-number")
    WebElement creditcardnumber;
    @FindBy(css = "#new-paymentcard-cvvnum")
    WebElement cardsecuritycode;
    @FindBy(css = "#wag-regpharmacy-address")
    WebElement billingstreetaddres;
    @FindBy(css = "#wag-regpharmacy-city")
    WebElement billingcity;
    @FindBy(css = "#wag-regpharmacy-state")
    WebElement choosebillingstate;
    @FindBy(css = "#wag-joinbr-zipcodemem")
    WebElement zipcodefield;
    @FindBy(css = "#new-payment-save")
    public
    WebElement savecardinfobtn;





    public void addPaymentMethodsBtn(){
        click(addpaymentbtn);
    }
    public void creditCardNumber(){
        type(creditcardnumber,"5414286358945235");
    }
    public void cardSecurityCode(){
        type(cardsecuritycode, "635");
    }
    public void billingStreetAddress(){
        type(billingstreetaddres, "444 main street");
    }
    public void billingCity(){
        type(billingcity,"Brooklyn");
    }
    public void ChooseState(){
        selectDropdownOption(choosebillingstate,"NY-New York");
    }
    public void zipCodeField(){
        type(zipcodefield,"11209");
    }
    public void saveCardInfo(){
        click(savecardinfobtn);
    }
}
