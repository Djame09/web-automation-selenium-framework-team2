package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroupsPage extends CommonAPI {

    public GroupsPage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@aria-label='Groups']")
    WebElement findGroup;
    @FindBy(xpath = "(//input[@type='search'])[1]")
    WebElement searchField;
    @FindBy(xpath = "//span[text()='Azeffoun les bouteilles']")
    WebElement groupName;
    @FindBy(xpath = "//span[text()='Join group']")
    WebElement joinGroupButtton;
    @FindBy(xpath = "//span[text()=' bouteilles']")
    WebElement typedName;


    public void clickOnGroupsIcon(){
        click(findGroup);
    }
    public void clickOnSearchIcon(){
        Actions action = new Actions(driver);
        action.moveToElement(searchField).click().build().perform();

        //click(searchField);element.sendKeys(text, Keys.ENTER);
    }
    public void typeOnSearchField(){
        typeAndEnter(groupName, "Azeffoun les bouteilles");
    }
    public void clickOnTypedName(){
        click(typedName);
    }
    public void hoverOverGroupeName(WebDriver driver) {
        hoverOver(driver,groupName);
    }

    public void clickOnJoinGroupButtuon() {
        click(joinGroupButtton);
    }













}
