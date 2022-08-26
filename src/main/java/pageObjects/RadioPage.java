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
    @FindBy (xpath = "//input[@class='myradio' and @id='yes']") public WebElement rdoOneYes;
    @FindBy (xpath = "//input[@class='myradio' and @id='no']") public WebElement rdoOneNo;
    @FindBy (xpath = "//input[@name='news' and @value='1']") public WebElement rdoTwoChecked;
    @FindBy (xpath = "//input[@name='news' and @value='0']") public WebElement rdoTwoUnchecked;
    @FindBy (xpath = "//input[@class='myradio' and @name='age' and @value='0']") public WebElement rdoThreeOne;
    @FindBy (xpath = "//input[@class='myradio' and @name='age' and @value='1']") public WebElement rdoThreeTwo;
    @FindBy (xpath = "//input[@class='myradio' and @name='age' and @value='2']") public WebElement rdoThreeThree;

}