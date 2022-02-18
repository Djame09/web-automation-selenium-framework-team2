package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponsPage extends CommonAPI {
    public CouponsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#filterCoupon")
    WebElement filtercouponscategories;
    @FindBy(css = "#clip12")
    WebElement clipcoupon;
    @FindBy(xpath = "//h2[text()='Enter your membership info to clip coupons.']")
    WebElement membershipinfotoclipcoupon;



    public void selectCouponsCategory(){
        selectDropdownOption(filtercouponscategories, "Household");
    }
    public void clipSelectedCoupon(){
        click(clipcoupon);
    }
    public String getCouponMembershipInfo(){
        return getText(membershipinfotoclipcoupon);
    }
}
