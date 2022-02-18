package us.piit.vacinneoptions;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.VaccinePage;

public class TestVaccineScheduling extends CommonAPI{

    @Test
    public void ScheduleCovidVaccin(){
        HomePage homepage = new HomePage(driver);
        VaccinePage vaccinepage = new VaccinePage(driver);




        homepage.clickOnVaccineBtn();
        vaccinepage.ChooseCovidVaccine();
        vaccinepage.typeCityAndState();
        vaccinepage.typeUserDOB();
        vaccinepage.previousVaccineDoses();
        vaccinepage.patientAuthorizationCode();
        vaccinepage.nextButton();
        vaccinepage.chooseVaccineDay();
        vaccinepage.chooseVaccineDay();
        vaccinepage.chooseVaccineDay();
        vaccinepage.chooseVaccineDay();
        vaccinepage.chooseVaccineTime();
        vaccinepage.confirmationButton();
        vaccinepage.secondDoseDay();
        vaccinepage.secondDoseTime();
        Assert.assertEquals(vaccinepage.getConfirmationtext(), "Add more protection");



    }
}
