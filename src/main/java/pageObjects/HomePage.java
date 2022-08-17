package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//div[@class='row']/ul/li[1]/a/img") public WebElement btn_Edit;
    @FindBy (xpath = "//div[@class='row']/ul/li[2]/a/img") public WebElement btn_Button;
    @FindBy (xpath = "//div[@class='row']/ul/li[3]/a/img") public WebElement btn_HyperLink;
    @FindBy (xpath = "//div[@class='row']/ul/li[4]/a/img") public WebElement btn_Image;

}