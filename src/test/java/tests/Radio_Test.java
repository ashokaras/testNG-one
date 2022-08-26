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

        if(!radioPage.rdoOneYes.isSelected()){
            radioPage.rdoOneYes.click();
        }
        if(!radioPage.rdoOneNo.isSelected()){
            radioPage.rdoOneNo.click();
        }

        if(radioPage.rdoTwoChecked.isSelected()){
            stepPass("Checked is selected by default");
        }

        if(!radioPage.rdoThreeThree.isSelected()){
            radioPage.rdoThreeThree.click();
        }

    }

}
