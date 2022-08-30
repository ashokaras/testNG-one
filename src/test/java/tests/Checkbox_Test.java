package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.CheckboxPage;
import pageObjects.HomePage;
import utils.BaseClass;

public class Checkbox_Test extends BaseClass {

    @Test(groups = "regression")
    public void checkboxFeatures(){
        HomePage homePage = new HomePage(driver);
        CheckboxPage checkboxPage = new CheckboxPage(driver);

        pageNavigation(homePage.btnCheckbox, "Checkbox", checkboxPage.pageTitle);

        for(WebElement i:checkboxPage.checkLanguages){
            System.out.println(i.getText());
            if(i.getText().equalsIgnoreCase("Java")){
                System.out.println("Inside if");
                click(i, "Java checkbox");
            }
        }
        wait(3000);
    }
}