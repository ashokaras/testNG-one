package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DropdownPage {

    WebDriver driver;

    public DropdownPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath="//section[@class='innerblock']/div[1]/select") public WebElement dropOne;
    @FindBy (xpath="//section[@class='innerblock']/div[2]/select") public WebElement dropTwo;
    @FindBy (xpath="//section[@class='innerblock']/div[3]/select") public WebElement dropThree;
    @FindBy (xpath="//section[@class='innerblock']/div[4]/select") public WebElement dropFour;
    @FindBy (xpath="//section[@class='innerblock']/div[5]/select") public WebElement dropFive;
    @FindBy (xpath="//section[@class='innerblock']/div[6]/select/option") public List<WebElement> dropSix;

}