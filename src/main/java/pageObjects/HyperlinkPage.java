package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HyperlinkPage {

    WebDriver driver;

    public HyperlinkPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath="//section[@class='innerblock']/div[1]/div/div/a") public WebElement lnk_Home;
    @FindBy (xpath="//section[@class='innerblock']/div[2]/div/div/a") public WebElement lnk_Navigation;
    @FindBy (xpath="//section[@class='innerblock']/div[3]/div/div/a") public WebElement lnk_Broken;
    @FindBy (xpath="//*[contains(text(),'Interact with same')]/preceding-sibling::a") public WebElement lnk_HomeLinkName;

}