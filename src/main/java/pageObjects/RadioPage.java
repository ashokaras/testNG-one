package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioPage {

    WebDriver driver;

    public RadioPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//h1[@class='wp-heading']") public WebElement pageTitle;
    @FindBy (xpath = "") public WebElement rdoOneYes;
    @FindBy (xpath = "") public WebElement rdoOneNo;
    @FindBy (xpath = "") public WebElement rdoTwoChecked;
    @FindBy (xpath = "") public WebElement rdoTwoUnchecked;
    @FindBy (xpath = "") public WebElement rdoThreeOne;
    @FindBy (xpath = "") public WebElement rdoThreeTwo;
    @FindBy (xpath = "") public WebElement rdoThreeThree;

}
