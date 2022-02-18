package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage extends CommonAPI {
    public ServicesPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//div[@class='category-item-card'])[4]")
    WebElement painmanagementservices;
    @FindBy(xpath = "(//div[@class='min-height'])[1]")
    WebElement getstartedbtn;



    public void painManagementServices(){
        click(painmanagementservices);
    }
    public void getStartedBtn(){
        click(getstartedbtn);
    }
}
