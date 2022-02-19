package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilPage extends CommonAPI {
    public ProfilPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@aria-label='Account'])[1]")
    WebElement accountIcon;
    @FindBy(xpath = "//span[text()='Log Out']")
    WebElement logOut;
    @FindBy(xpath = "//span[text()='Give feedback']")
    WebElement giveFeedbackLink;
    @FindBy(xpath = "//span[text()='Give Feedback to Facebook']")
    WebElement textMessage;
    @FindBy(xpath = "//span[text()='Something went wrong']")
    WebElement text;
    @FindBy(xpath = "//span[text()='Something went wrong']")
    WebElement somethingWentWongIcon;
    @FindBy(xpath = "//span[text()='Choose an area']")
    WebElement chooseAnAreaLink;
    @FindBy(xpath = "(//span[text()='Other'])[2]")
    WebElement otherWord;
    @FindBy(xpath = "//textarea[@style='overflow-y: auto;']")
    WebElement detailsField;
    @FindBy(xpath = "//span[text()='Submit']")
    WebElement submitButton;
    @FindBy(xpath = "//span[text()='Help & Support']")
    WebElement helpSupport;
    @FindBy(xpath = "//span[text()='Help Center']")//(//span[text()='Marketplace'])[3]
    WebElement helpCenter;
    @FindBy(xpath = "//input[@type='search']")
    WebElement searchField;
    @FindBy(xpath = "//span[text()='How do I lock my profile on Facebook?']")
    WebElement askQuestion;
    @FindBy(xpath = "(//div[@aria-label='Yes'])[3]")
    WebElement yesButton;
    @FindBy(xpath = "//textarea[@style='overflow-y: hidden;']")
    WebElement description;
    @FindBy(xpath = "//span[text()='How can we help you?']")
    WebElement textDisplayed;
    @FindBy(xpath = "//span[text()='Settings & privacy']")
    WebElement settingPrivacy;
    @FindBy(xpath = "//span[text()='Language']")//(//span[text()='Marketplace'])[3]
    WebElement languageOption;
    @FindBy(xpath = "//a[@data-meta='{\"ajaxify\":\"\\/ajax\\/settings\\/language\\/account.php\",\"rel\":\"async\"}']")
    WebElement editLink;
    @FindBy(xpath = "//select[@name='new_language']")
    WebElement languages;
    @FindBy(xpath = "(//input[@value='Save changes']")
    WebElement saveChangesButton;
    public void clickOnSettingPrivacy(){click(settingPrivacy);}
    public void clickOnLanguageOption(){click(languageOption);}
    public void clickOnEditLink(){click(editLink);}
       // Actions action = new Actions(driver);
       // action.moveToElement(editLink).click().build().perform();}
    public void clickOnSaveChanges(){click(saveChangesButton);}
    public void selectDropdownLanguage(String option) {
        selectDropdownOption(languages, "Deutsch");
    }
    public void clickOnhelpSupport(){click(helpSupport);}
    public void clickOnhelpCenter(){click(helpCenter);}
    public void clickOnSearchField(){click(searchField);}
    public void clickOnMarketOption(){click(askQuestion);}
    public void acceptAlert(){click(yesButton);}
    public void typeTheDescription(){type(description, "all right");}
    public String getProfilePageTitle(){
        return getTitle();
    }
    public void clickOnAccountIcon(){
        click(accountIcon);
    }
    public void clickOnLogOut(){
        click(logOut);
    }
    public void clickOnFeedback(){click(giveFeedbackLink);}
    public String getTextMassege() {return getText(textMessage);}
    public void clickOnSomethingWentWongIcon(){click(somethingWentWongIcon);}
    public String getText() {return getText(text);}
    public void clickOnChooseAnAreaLink(){               //click(chooseAnAreaLink);}
    Actions action = new Actions(driver);
    action.moveToElement(chooseAnAreaLink).click().build().perform();}
    public void clickOnOtherOption(){click(otherWord);}
    public void scrollDownIntoView() {scrollToView(otherWord);}
    public void typeOnDetailsField(){type(detailsField, "the site bugs");}
    public void clickOnSubmitButton(){click(submitButton);}
    public String getTextDisplayed() {return getText(textDisplayed);}

}
