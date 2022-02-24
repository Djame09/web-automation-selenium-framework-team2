package us.piit.search;

import base.CommonAPI;
import org.testng.annotations.Test;
import us.piit.HomePage;
import utility.DataReader;

import java.util.List;

public class SearchMultiElement extends CommonAPI {
    DataReader dr = new DataReader();

    public List<String> getItemsFromExcel(){
        return dr.getEntireColumnForGivenHeader("..\\Alibaba\\src\\data\\New Microsoft Excel Worksheet.xlsx", "Sheet1",  "list");
    }
    @Test
    public void searchItems(){
        HomePage homePage = new HomePage(driver);
        for (String item: getItemsFromExcel()) {
            homePage.searchInOneClickAndClear(item);
        }

    }
}
