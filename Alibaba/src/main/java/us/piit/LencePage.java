package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LencePage extends CommonAPI {
    public LencePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy(xpath = "//span[@class='float-add-cart']")
    WebElement addtocard;
    @FindBy(xpath = " @FindBy(xpath = \"//b[text()='+']\")")
    WebElement addQuantity;



    public void clickToAddToCard(){
        click(addtocard);
    }
    public void AddlenceQuantity(){
        click(addQuantity);
    }

}