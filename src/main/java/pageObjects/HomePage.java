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

    @FindBy (xpath = "//div[@class='row']/ul/li[1]/a/img") public WebElement btnEdit;
    @FindBy (xpath = "//div[@class='row']/ul/li[2]/a/img") public WebElement btnButton;
    @FindBy (xpath = "//div[@class='row']/ul/li[3]/a/img") public WebElement btnHyperLink;
    @FindBy (xpath = "//div[@class='row']/ul/li[4]/a/img") public WebElement btnImage;
    @FindBy (xpath = "//div[@class='row']/ul/li[5]/a/img") public WebElement btnDropdown;
    @FindBy (xpath = "//div[@class='row']/ul/li[6]/a/img") public WebElement btnRadio;
    @FindBy (xpath = "//div[@class='row']/ul/li[7]/a/img") public WebElement btnCheckbox;
    @FindBy (xpath = "//div[@class='row']/ul/li[8]/a/img") public WebElement btnTable;
    @FindBy (xpath = "//div[@class='row']/ul/li[9]/a/img") public WebElement btnAlert;
    @FindBy (xpath = "//div[@class='row']/ul/li[10]/a/img") public WebElement btnFrame;
    @FindBy (xpath = "//div[@class='row']/ul/li[11]/a/img") public WebElement btnWindow;
    @FindBy (xpath = "//div[@class='row']/ul/li[12]/a/img") public WebElement btnCalendar;

}