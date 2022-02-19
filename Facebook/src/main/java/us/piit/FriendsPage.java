package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FriendsPage extends CommonAPI {
    public FriendsPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@aria-label='Friends']")
    WebElement searchFriend;
    @FindBy(xpath = "//input[@placeholder='Search Facebook']")
    WebElement searchField;
    @FindBy(xpath = "//span[text()='Amirouche Boudissa']")
    WebElement imageName;
    @FindBy(xpath = "//span[@dir='auto']")
    WebElement name;
    @FindBy(xpath = "//div[@style='transform: none;']")
    WebElement addFriend;

    public void typeName() {
        typeAndEnter(searchField, "amirouche boudissa");
    }

    public void selectDropdownOption(String option) {
        selectDropdownOption(name, "amirouche boudissa");
    }

    public void hoverOverImageName(WebDriver driver) {
        hoverOver(driver, imageName);
    }

    public void clickaddfriend() {
        click(addFriend);
    }

    public String getFriendsPageTitle() {
        return getTitle();

    }
}