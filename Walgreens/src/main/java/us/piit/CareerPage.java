package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage extends CommonAPI {
    public CareerPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[text()='No Thanks']")
    public
    WebElement nothanksbtn;
    @FindBy(xpath = "//input[@class='button-solid-blue']")
    public
    WebElement submitbtn;
    @FindBy(css = "//input[@id='form-field-f7be0e636d']")
    WebElement lastnamefield;
    @FindBy(css = "#form-field-5085a8ece3")
    WebElement firstnamefield;
    @FindBy(xpath = "//input[@id='form-field-4d15ab34be']")
    WebElement emailfield;
    @FindBy(xpath = "//select[@id='form-field-877b6d83c8-category']")
    WebElement selectjobcategory;






    public void noThanksBtn(){click(nothanksbtn);}
    public void scrollTosubmitBtn(){scrollToView(submitbtn);}
    public void lastNameField(){type(lastnamefield, "TESTER");}
    public void firstNameField(){type(firstnamefield, "MAURICE");}
    public void emailField(){type(emailfield, "maurice.tester18@gmail.com");}
    public void selectJobCategory(){selectDropdownOption(selectjobcategory, "Engineering");}

    public void clickSubmitBtn(){click(submitbtn);}
}
