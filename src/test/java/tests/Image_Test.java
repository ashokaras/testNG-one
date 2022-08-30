package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ImagePage;
import utils.BaseClass;

import java.util.List;

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

        List<WebElement> list =  driver.findElements(By.tagName("img"));
        list.get(0);
        list.get(1);
        list.size();
        for(int i=0; i<list.size(); i++){

        }

        wait(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(imagePage.imgActions).click().build().perform();
        wait(2000);
        navigateBack();
        wait(2000);

    }

}