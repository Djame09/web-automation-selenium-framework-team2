package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends CommonAPI {
    public CartPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#wag-cart-remove_sku6233205")
    WebElement removeitemfromcart;
    @FindBy(css = "#wag-cart-empty-lbl")
    WebElement emptycartmsg;


    public void removeCartItem(){
        click(removeitemfromcart);
    }
    public String getEmptyCartText(){
        return getText(emptycartmsg);
    }
}
