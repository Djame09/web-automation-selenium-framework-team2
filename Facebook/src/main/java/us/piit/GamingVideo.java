package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamingVideo extends CommonAPI {


    public GamingVideo(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//span[text()='Gaming Video'])[1]")
    WebElement gamingVideo;
    @FindBy(xpath = "(//span[text()='Play Games'])[1]")
    WebElement playVideo;
    @FindBy(xpath = "(//span[text()='Solitaire'])[3]")
    WebElement solitaireGame;
    @FindBy(xpath = "//span[text()='Give Feedback to Facebook']")
    WebElement textMessage;
    @FindBy(xpath = "//span[text()='Something went wrong']")
    WebElement text;
    public void scrollDownIntoView() {
        scrollToView(solitaireGame);
    }

    public void clickOnSolitaiteGame() {
        Actions action = new Actions(driver);
        action.moveToElement(solitaireGame).click().build().perform();
        //click(marketPlace);
    }

    public String getGamingVideoTitle() {
        return getTitle();
    }

    public String getTextMassege() {
        return getText(text);
    }
    public void clickOnGamingVideo(){
        click(gamingVideo);
    }
}

