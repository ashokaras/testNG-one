package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HyperlinkPage {

    WebDriver driver;

    public HyperlinkPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
