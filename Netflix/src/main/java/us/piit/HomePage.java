package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-uia=\"search-box-launcher\"]")
    WebElement iconSearchButton;
//    @FindBy(xpath = "//*[@class='searchTab']")
//    WebElement searchBar;

    @FindBy(xpath = "(//*[@class='profile-icon'])[1]")
    WebElement sofAccount;
    @FindBy(xpath = "//*[@class=\"searchBox\"]")
    WebElement searchMovie;
    @FindBy(xpath = "//a[@class='current active']")
    WebElement tvShow;
    @FindBy(xpath = "//div[@class='label']")
    WebElement genres;
    @FindBy(xpath = "")
    WebElement action;
    @FindBy(xpath = "(//div[@class='ltr-1i33xgl'])[1]")
    WebElement play;
    @FindBy(xpath = "//div[@class='account-dropdown-button']")
    WebElement dropDwonlogAccount;
    @FindBy(xpath = "//svg[@class='Hawkins-Icon Hawkins-Icon-Standard']")
    WebElement helpCenter;
    @FindBy(xpath = "(//li[@class='navigation-tab'])[5]")
    WebElement mylist;
    @FindBy(xpath = "(//div[@class='fallback-text-container'])[1]")
    WebElement narcosmexico;



    public void HoverOverMyList(){hoverOver(driver,narcosmexico); }

    public void clickMyList(){click(mylist);}

    public void setIconSearchButton(){
        type(iconSearchButton, "ozark");
    }
    public void setSofAccount(){
        click(sofAccount);
    }
    public void setSearchMovie(String movie){
        type(searchMovie, movie);
    }
//    public void setSearchBar(String movie){type(searchBar, movie);}
    public void setTvShow(){
        click(tvShow);
    }
    public void setGenres(){
        click(genres);
    }
    public void setAction(){
        click(action);
    }
    public void setPlay(){
        click(play);
    }

    //public void dropdownLogAccount(WebDriver dirver){
    }
   // public void clickHelpCenter(){clickHelpCenter();
   // }




