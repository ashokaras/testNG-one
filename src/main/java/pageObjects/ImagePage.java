package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImagePage {

    WebDriver driver;

    public ImagePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath="//section[@class='innerblock']/div[1]//img") public WebElement imgHome;
    @FindBy (xpath="//section[@class='innerblock']/div[2]//img") public WebElement imgBroken;
    @FindBy (xpath="//section[@class='innerblock']/div[3]//img") public WebElement imgActions;

}