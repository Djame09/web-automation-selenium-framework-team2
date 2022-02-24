package us.piit;


import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='sc-hd-category']")
    WebElement Categories;
    @FindBy(xpath = "//input[@type='text']")
    WebElement search;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;
    @FindBy(xpath = "//div[@class='sc-hd-ms-icon sc-hd-i-unsignavatar']")
    WebElement singIn;
    @FindBy(xpath = "//a[@class='sc-hd-ms-btsignin']")
    WebElement singinButton;
    @FindBy(xpath = "//a[text()='Ready to Ship']")
    WebElement readytoship;
    @FindBy(xpath = "//div[text()='Consumer Electronics']")
    WebElement consummerElectronics;
    @FindBy(xpath = "//header/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/a[1]")
    WebElement HomeAndGarden;
    @FindBy(xpath = "//div[contains(text(),'Bathroom Products')]")
    WebElement BathroomProducts;
    @FindBy(xpath = "//a[contains(text(),'Messages')]")
    WebElement Messages;
    @FindBy(xpath = "//header/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]")
    WebElement SingIn;
    @FindBy(xpath = "//img[@class='lazyload']")
    WebElement Browsenewarrivals;
    @FindBy(xpath = "//body/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]/div[1]")
    WebElement monitor;
    @FindBy(xpath = "//a[text()='Buyer Central']")
    WebElement buyercentral;
   @FindBy(xpath = "//span[contains(text(),'Logistics Service')]")
    WebElement logisticservice;
   @FindBy(xpath = "(//div[@data-role='select-language'])[2]")
   WebElement language;
   @FindBy(xpath = "(//div[@class='ui-header-lan J-header-lan'])[2]")
   WebElement changelanguage;
    @FindBy(xpath = "//header/div[4]/div[1]/div[4]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[5]")
    WebElement languagselcted;
    @FindBy(xpath = "//a[text()='Global Original Sources']")
    WebElement GlobalOriginalSources;
    @FindBy(xpath = "(//span[@class='txt'])[2]")
    WebElement Apparel;
    @FindBy(xpath="//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/h3[1]/a[1]")
    WebElement mensclothing;
    @FindBy(xpath = "//div[@class='sc-hd-ship-to']")
    WebElement shipTo;
    @FindBy(xpath = "//input[@placeholder='Enter keyword to search.']")
    WebElement country;
    @FindBy(xpath = "(//input[@aria-label='Medium'])[1]")
    WebElement requestitem;
    @FindBy(xpath = "(//input[@aria-label='Medium'])[2]")
    WebElement requestitemquantity;
    @FindBy(xpath = "//a[@data-spm='dform']")
    WebElement requestbutton;
    @FindBy(xpath = "//h3[text()='One Request, Multiple Quotes']")
    WebElement board;
    @FindBy(xpath = "//a[@class='facebook']")
    WebElement facebook;





 public void getfacebook(){
     click(facebook);
 }


    public void clickrequest(){
    click(requestbutton);
}
public void numberofitems(){
    type(requestitemquantity,"10");
}
    public void typerequestitems(){
        type(requestitem,"smart watch");

    }
    public void scrollrequest(){
    scrollToView(board);
    }



    public void getcountry() {
//        Actions actions=new Actions(driver);
//        actions.moveToElement(country).click().build().perform();
       click(country);
       typeAndEnter(country,"Algeria");
    }

//    public void countryname(){
//        click(Algeria);
//    }
    public void getshipto(WebDriver driver){
        hoverOver(driver,shipTo);
    }

    public void getmensclothing(){
        click(mensclothing);
    }
    public void getApparel(WebDriver driver){
        hoverOver(driver,Apparel);
    }
    public void getglobaloriginsources() {
    scrollToView(GlobalOriginalSources);
}
    public void clickGlobalorigin(){
    Actions actions=new Actions(driver);
    actions.moveToElement(GlobalOriginalSources).click().build().perform();
        //click(GlobalOriginalSources);
}
 public void hoveroverlanguage(WebDriver driver){

     hoverOver(driver,changelanguage);
 }
    public void selectlanguage(){
     click(language);
     click(languagselcted);

    }
    public void buyercentrallist(WebDriver driver){
        hoverOver(driver,buyercentral);
      click(logisticservice);

    }





    public void scrolldowntoelement(){
        scrollToView(Browsenewarrivals);
        click(monitor);

    }


    public void hoverOverCategories(WebDriver driver) {
        hoverOver(driver, Categories);
    }
    public void hoveoverMessages(WebDriver driver){
        hoverOver(driver,Messages);
    }
    public void singINMessage(){
        click(SingIn);
    }

    public void searchelements(String elementToSearch) {
        type(search, elementToSearch);
        click(submitButton);
    }

    public void hoverOverSingIn(WebDriver driver) {
        hoverOver(driver, singIn);
    }

    public void singInbutton() {
        click(singinButton);
    }


    public void alibabaTab() {
        click(readytoship);
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()) {
            String parentTap = iterator.next();
            String newTab = iterator.next();
            driver.switchTo().window(newTab);
            click(consummerElectronics);
            waitFor(2);
        }
    }
    public void searchInOneClickAndClear(String itemToSearch){
        typeAndEnter(search, itemToSearch);
        clear(search);
    }


    public void alibabaTab1() {
        click(HomeAndGarden);
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()) {
            String parentTap = iterator.next();
            String newTab = iterator.next();
            driver.switchTo().window(newTab);
            click(BathroomProducts);
            waitFor(2);
        }


    }


}