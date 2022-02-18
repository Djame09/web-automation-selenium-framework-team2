package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends CommonAPI {
    public ProductsPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//select[@id='onSortOptionChangeHandler']")
    WebElement topsellerwater;
    @FindBy(css="#prodBrandNamecompare_sku6233205")
    WebElement watertobuy;
    @FindBy(xpath = "//strong[text()='Add for pickup']")
    WebElement addproducttocart;
    @FindBy(xpath = "//strong[text()='1 Item added to your cart for pickup at store']")
    WebElement itemaddedtocartconfirmation;
    @FindBy(css = "#addToCart-cart-checkout")
    WebElement viewcartbtn;


    public void TopSellerWater(){

        selectDropdownOption(topsellerwater, "Top Sellers");
        }
    public void ScrollToDesiredProduct(){

        scrollToView(watertobuy);
    }
    public void DesiredToGetWater(){

        click(watertobuy);
    }
    public void AddToCart(){

        click(addproducttocart);
    }
    public  String getCartText(){

        return getText(itemaddedtocartconfirmation);
    }
    public void GoToCart(){
        click(viewcartbtn);
    }




}
