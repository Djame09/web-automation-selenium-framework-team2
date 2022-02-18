package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VaccinePage extends CommonAPI {
    public VaccinePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#covid-btn")
    WebElement covidvaccine;
    @FindBy(css = "#inputLocations")
    WebElement locatintogetvaccine;
    @FindBy(css = "#userDob")
    WebElement userdob;
    @FindBy(css = "#dose1")
    WebElement previousdoses;
    @FindBy(css = "#radio-1")
    WebElement authorozationcode;
    @FindBy(css = "#nextBtn")
    WebElement clicknextbtn;
    @FindBy(xpath = "(//span[@class='icon icon__arrow-down timeslotArrow'])[2]")
    WebElement vaccineday;
    @FindBy(css = "(//span[@role='button'])[1]")
    WebElement vaccinetime;
    @FindBy(xpath = "(//button[text()='Next'])[1]")
    WebElement confirmationbutton;
    @FindBy(xpath = "(//span[@class='icon icon__arrow-down timeslotArrow'])[2]")
    WebElement seconddoseday;
    @FindBy(xpath = "(//span[@class='btn btn__inline timeSlot '])[1]")
    WebElement seconddosetime;
    @FindBy(xpath = "//button[text()='Next']")
    WebElement seconddoseconfirmationbutton;
    @FindBy(xpath = "//h1[text()='Add more protection']")
    WebElement confirmationpage;




    public void ChooseCovidVaccine(){
        click(covidvaccine);
    }
    public void typeCityAndState(){
        type(locatintogetvaccine, "Brooklyn, NY, USA");
    }
    public void typeUserDOB(){
        type(userdob, "01/01/2000");
    }
    public void previousVaccineDoses(){
        click(previousdoses);
    }
    public void patientAuthorizationCode(){
        click(authorozationcode);
    }
    public void nextButton(){
        click(clicknextbtn);
    }
    public void chooseVaccineDay(){
        click(vaccineday);
    }
    public void chooseVaccineTime(){
        click(vaccinetime);
    }
    public void confirmationButton(){
        click(confirmationbutton);
    }
    public void secondDoseDay(){
        click(seconddoseday);
    }
    public void secondDoseTime(){
        click(seconddosetime);
    }
    public void secondDoseConfirmation(){
        click(seconddoseconfirmationbutton);
    }
    public String getConfirmationtext(){
        return getText(confirmationpage);
    }
}
