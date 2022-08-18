package tests;

import org.testng.annotations.Test;
import pageObjects.EditPage;
import pageObjects.HomePage;
import utils.BaseClass;

public class Edit_Test extends BaseClass {

    @Test
    public void Edit_Features(){
        HomePage homePage = new HomePage(driver);
        EditPage editPage = new EditPage(driver);

        click(homePage.btnEdit);
        type(editPage.txt_Email, "Sample@gamil.com");
        type(editPage.txt_Append, "Sample@email.com");
        System.out.println("Default text: " + editPage.txt_Default.getAttribute("value"));
        editPage.txt_Clear.clear();
        System.out.println("Is the field disabled: " + editPage.txt_Disabled.getAttribute("disabled"));

    }
}