package tests;

import org.testng.annotations.Test;
import pageObjects.DropdownPage;
import pageObjects.HomePage;
import utils.BaseClass;

public class Dropdown_Test extends BaseClass {

    @Test
    public void dropdownFeatures(){
        HomePage homePage = new HomePage(driver);
        DropdownPage dropdownPage = new DropdownPage(driver);

        click(homePage.btnDropdown, "Dropdown button");
        dropdownIndex(dropdownPage.dropOne, 1);
        dropdownText(dropdownPage.dropTwo, "Selenium");
        dropdownValue(dropdownPage.dropThree, "3");
        System.out.println("Total number of options: " + dropdownOptions(dropdownPage.dropFour));
        type(dropdownPage.dropFive, "Selenium", "Sendkeys drop down");
        comboBox(dropdownPage.dropSix, "Loadrunner");
        wait(3000);

    }

}
