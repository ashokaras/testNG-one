package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.ButtonPage;
import pageObjects.HomePage;
import utils.BaseClass;

public class Button_Test extends BaseClass {

    @Test(groups = "regression")
    public void buttonFeatures(){

        HomePage homePage = new HomePage(driver);
        ButtonPage buttonPage = new ButtonPage(driver);

        click(homePage.btnButton, "Button button");
        click(buttonPage.btn_BackToHome, "Back to home button");
        elementExists(homePage.btnButton);
        click(homePage.btnButton, "Button button");

        System.out.println("Button position in the page: " + buttonPage.btn_Position.getLocation());

        System.out.println("Button colour: " + buttonPage.btn_Colour.getCssValue("background-color"));

        System.out.println("Button size: " + buttonPage.btn_Size.getSize());
        System.out.println("Button size: " + buttonPage.btn_Size.getCssValue("padding"));

    }

}