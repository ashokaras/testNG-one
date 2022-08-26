package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxPage {

    WebDriver driver;

    public CheckboxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//section[@class='innerblock']/div[1]/input") public WebElement pageTitle;
    @FindBy (xpath = "//section[@class='innerblock']/div[1]/input") public List<WebElement> checkLanguages;

}
