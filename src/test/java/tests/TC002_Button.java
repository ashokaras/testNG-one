package tests;

import org.testng.annotations.Test;
import pageObjects.ButtonPage;
import pageObjects.HomePage;
import utils.BaseClass;

public class TC002_Button extends BaseClass {

    @Test
    public void buttonFeatures(){

        HomePage homePage = new HomePage(driver);
        ButtonPage buttonPage = new ButtonPage(driver);

        click(homePage.btn_Button);
        click(buttonPage.btn_BackToHome);
        elementExists(homePage.btn_Button);
        click(homePage.btn_Button);

        System.out.println("Button position in the page: " + buttonPage.btn_Position.getLocation());

        System.out.println("Button colour: " + buttonPage.btn_Colour.getCssValue("background-color"));

        System.out.println("Button size: " + buttonPage.btn_Size.getSize());
        System.out.println("Button size: " + buttonPage.btn_Size.getCssValue("padding"));

    }

}
