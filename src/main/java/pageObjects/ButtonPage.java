package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {
    public WebDriver driver;

    public ButtonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@class='innerblock']/div[1]/div/div/button") public WebElement btn_BackToHome;
    @FindBy(xpath = "//section[@class='innerblock']/div[2]/div/div/button") public WebElement btn_Position;
    @FindBy(xpath = "//section[@class='innerblock']/div[3]/div/div/button") public WebElement btn_Colour;
    @FindBy(xpath = "//section[@class='innerblock']/div[4]/div/div/button") public WebElement btn_Size;

}