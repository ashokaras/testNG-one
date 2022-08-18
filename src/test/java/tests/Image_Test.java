package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ImagePage;
import utils.BaseClass;

public class Image_Test extends BaseClass {

    @Test
    public void ImageFeatures(){
        HomePage homePage = new HomePage(driver);
        ImagePage imagePage = new ImagePage(driver);

        click(homePage.btnImage, "Image button");
        elementExists(imagePage.imgHome);
        click(imagePage.imgHome, "Home image");
        navigateBack();

        if(Integer.valueOf(imagePage.imgBroken.getAttribute("naturalWidth"))==0){
            System.out.println("Image is broken");
        }

        wait(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(imagePage.imgActions).click().build().perform();
        wait(2000);
        navigateBack();
        wait(2000);

    }

}