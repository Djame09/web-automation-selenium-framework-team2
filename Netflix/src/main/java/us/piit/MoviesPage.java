package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviesPage extends CommonAPI {
    public MoviesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Movies']")
    WebElement movies;
    @FindBy(xpath = "//span[@class='arrow']")
    WebElement genres;
    @FindBy(xpath = "//a[text()='Documentaries']")
    WebElement documentaries;
    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]")
    WebElement truecrimedocumentaries;
    @FindBy(xpath = "(//a[@class='slider-refocus'])[17]")
    WebElement americanmurder;

    public void hoverOverAmericanMurder(WebDriver driver){
        hoverOver(driver,americanmurder);
    }
    public void clickAmericanMurder(){
        click(americanmurder);
    }

    public void scrollDocumentaries(){
        scrollToView(truecrimedocumentaries);
    }
    public void clickDocumentaries(){
        click(documentaries);
    }

    public void clickMovies(){
        click(movies);
    }

    public void clickGenres(){
        click(genres);
    }

}

