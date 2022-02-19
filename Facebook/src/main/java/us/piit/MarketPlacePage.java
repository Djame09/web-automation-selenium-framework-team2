package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPlacePage extends CommonAPI {

    public MarketPlacePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Marketplace']")
    WebElement marketPlace;
    @FindBy(xpath = "//h1[text()='Marketplace']")
    WebElement text;
    @FindBy(xpath = "(//input[@type='search'])[2]")
    WebElement searchField2;
    @FindBy(xpath = "(//span[text()='Ships to you'])[1]")
    WebElement iteamShoes;
    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    WebElement addtocart;
    @FindBy(xpath = "//span[text()='Search results']")
    WebElement pageTitle;
    @FindBy(xpath = "//span[text()='Cart']")
    WebElement cart;
    @FindBy(xpath = "(//span[text()='Remove'])[1]")
    WebElement removeButton;
    @FindBy(xpath = "(//i[@class='hu5pjgll lzf7d6o1'])[1]")
    WebElement settingIcon;
    @FindBy(xpath = "//span[text()='Set a custom buyer message']")
    WebElement setMessage;
    @FindBy(xpath = "(//input[@dir='ltr'])[4]")
    WebElement typeMessage;
    @FindBy(xpath = "(//span[text()='Save'])[1]")
    WebElement saveButton;

    public void clickOnSettingIcon(){
        click(settingIcon);
    }
    public void clickOnSetMessage(){
        click(setMessage);
    }
    public void typeMessageCustomBuyer(){
        type(typeMessage, "Is this still available?Please answer for me.");
    }
    public void clickOnSaveButton(){
        click(saveButton);
    }


    public void scrollDownIntoView() {
        scrollToView(marketPlace);
    }

    public void clickOnMarketPlace() {
        Actions action = new Actions(driver);
        action.moveToElement(marketPlace).click().build().perform();
        //click(marketPlace);
    }
    public String getPageTitle() {
        return getText(pageTitle);
    }
    public String getTextMassege() {
        return getText(text);
    }
    public void typeItemToSearch(){
        type(searchField2, "shoes for men size 10");
    }
    public void clickOnItemShoes(){
        click(iteamShoes);
    }
    public void clickOnAddToCart(){
        click(addtocart);
    }
    public void clickOnCart(){
        click(cart);
    }
    public void clickOnRemoveButton(){
        click(removeButton);
    }

    }
