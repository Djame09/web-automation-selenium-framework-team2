package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
   @FindBy(xpath = "(//span[@class='icon icon__arrow-down'])[2]")
    WebElement accountbtn;
    @FindBy(xpath = "//a[@id='pf-dropdown-register']")
    WebElement registerbtn;
    @FindBy(xpath = "(//strong[text()='Sign in'])[2]")
    public
    WebElement signinbtn;
    @FindBy(css="#ntt-placeholder")
    WebElement homesearchbar;
    @FindBy(css="#pf-icon__search")
    public
    WebElement searchbtn;
    @FindBy(xpath = "//strong[text()='Schedule vaccine']")
    WebElement vaccinebtn;
    @FindBy(xpath = "(//span[@class='icon icon__arrow-down'])[1]")
    WebElement homemenubtn;
    @FindBy(xpath = "//span[text()='Coupons']")
    public
    WebElement couponsbtn;
    @FindBy(xpath = "//strong[text()='Pharmacy Chat']")
    WebElement pharmacychatbtn;
    @FindBy(xpath = "(//div[@class='card__content'])[1]")
    WebElement seehealthservices;
    @FindBy(xpath = "//span[text()='Shop Products']")
    public
    WebElement shopproductsbtn;
    @FindBy(xpath = "//span[text()='Pet']")
    WebElement petdropdownbtn;
    @FindBy(xpath = "//span[text()='Cat Supplies']")
    public
    WebElement catsuppliesbtn;
    @FindBy(xpath = "//a[text()='Cat Food']")
    WebElement catfoodbtn;
    @FindBy(xpath = "(//span[text()='Beauty'])[1]")
    public
    WebElement beautysuppliesbtn;
    @FindBy(xpath = "(//strong[text()='Shop Beauty'])[1]")
    WebElement shopbeautybtn;
    @FindBy(xpath = "//a[text()='Careers']")
    public
    WebElement careerbtn;
    @FindBy(xpath = "(//span[text()='Medicines & Treatments'])[1]")
    public
    WebElement medicinesandtreatmentsbnt;
    @FindBy(xpath = "(//span[text()='Cough, Cold & Flu'])[1]")
    WebElement coughcoldflubtn;
    @FindBy(xpath = "(//a[text()='Adult Cold Remedies'])[1]")
    WebElement adultcoldremedies;
    @FindBy(xpath = "(//span[text()='Vitamins & Supplements'])[1]")
    public
    WebElement vitamiesandsupplements;
    @FindBy(xpath = "//span[text()='Multivitamins']")
    public
    WebElement vitaminesbtn;
    @FindBy(xpath = "//a[contains(text(),\"Men's Multivitamins\")]")
    WebElement mensvitaminesbtn;
    @FindBy(xpath = "//span[contains(text(),'Home Health Care Solutions')]")
    public
    WebElement homehealthcarebtn;
    @FindBy(xpath = "(//span[text()='Home Tests & Monitoring'])[3]")
    WebElement hometestbtn;
    @FindBy(xpath = "(//a[text()='At Home COVID Tests'])[3]")
    WebElement athomecovidtestbtn;
    @FindBy(xpath = "//span[contains(text(),'Home Goods')]")
    public
    WebElement homegoodsbtn;
    @FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[9]/div[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement homedecorbtn;
    @FindBy(xpath = "//header/div[1]/nav[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[9]/div[1]/ul[1]/li[3]/ul[1]/li[8]/a[1]")
    WebElement decorativeaccentsbtn;






   public void  clickOnAccountBtn(){
       click(accountbtn);
   }
   public void clickOnRegisterBtn(){
       click(registerbtn);
   }
    public void clickOnSigninBtn(){
       click(signinbtn);
    }
    public void typeOnHomeSearchBar(){type(homesearchbar, "water");}
    public void clickOnSearchBtn(){click(searchbtn);}
    public void clickOnVaccineBtn(){click(vaccinebtn);}
    public void clickOnHomeMenu(){click(homemenubtn);}
    public void clickOnCouponsBtn(){
       click(couponsbtn);
    }
    public void clickOnPharmacyChatBtn(){
       click(pharmacychatbtn);
    }
    public void ScrollToViewService(){
       scrollToView(seehealthservices);
    }
    public void seeHealthServices(){
       click(seehealthservices);
    }
    public void shopProductsBtn(){
       click(shopproductsbtn);
    }
    public void petDropDownbtn(){
       click(petdropdownbtn);
    }
    public void catSuppliesBtn(){
       click(catsuppliesbtn);
    }
    public void catFoodBtn(){
       click(catfoodbtn);
    }
    public void beautySuppliesBtn(){
       click(beautysuppliesbtn);
    }
    public void shopBeautyBtn(){click(shopbeautybtn);}
    public void scrollToViewCarrer(){scrollToView(careerbtn);}
    public void clickOnCareerBtn(){click(careerbtn);}
    public void medicinesAndTreatmentBtn(){click(medicinesandtreatmentsbnt);}
    public void CoughColdFlu(){click(coughcoldflubtn);}
    public void adultColdRemedies(){click(adultcoldremedies);}
    public void vitaminesAndSupplements(){click(vitamiesandsupplements);}
    public void vitaminesBtn(){click(vitaminesbtn);}
    public void mensVitaminesBtn(){click(mensvitaminesbtn);}
    public void homeHealthCareBtn(){click(homehealthcarebtn);}
    public void homeTestBtn(){click(hometestbtn);}
    public void atHomeCovidTestBtn(){click(athomecovidtestbtn);}
    public void homeGoodsBtn(){click(homegoodsbtn);}
    public void homeDecorBtn(){click(homedecorbtn);}
    public void setDecorativeAccentsBtn(){click(decorativeaccentsbtn);}



}
