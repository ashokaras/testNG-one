package tests;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RadioPage;
import utils.BaseClass;

public class Radio_Test extends BaseClass {

    @Test
    public void radiobuttonFeatures(){

        HomePage homePage = new HomePage(driver);
        RadioPage radioPage = new RadioPage(driver);

        pageNavigation(homePage.btnRadio, "Radio button", radioPage.pageTitle);

    }

}
