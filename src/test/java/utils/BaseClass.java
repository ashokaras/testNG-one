package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    private String url;
    private String browserName;
    public WebDriver driver;
    static Properties properties;

    @BeforeClass
    public void launchBrowser() throws IOException {
        switch (getProperty("browserName")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Setting chrome as default since there are no browser names provided as input.");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(getProperty("url"));
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    public static void loadProperties() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/config.properties");
        properties = new Properties();
        properties.load(fileInputStream);
    }

    public static String getProperty(String property) throws IOException {
        loadProperties();
        return properties.getProperty(property);
    }

    public void click(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void type(WebElement element, String input){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(input);
    }

}