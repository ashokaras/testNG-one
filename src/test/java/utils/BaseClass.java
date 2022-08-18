package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class BaseClass extends ReporterClass{

    public WebDriver driver;
    static Properties properties;

    @BeforeClass
    public void launchBrowser() throws IOException {

        createTest(this.getClass().toString().substring(12));

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

    public void click(WebElement element, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        stepPass(elementName + " is clicked");
    }

    public void type(WebElement element, String input, String elementName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(input);
        stepPass(input + " text is entered in the " + elementName);
    }

    public int returnNumberOfElements(String tagName){
        List<WebElement> list = driver.findElements(By.tagName(tagName));
        return list.size();
    }

    public void wait(int milliSeconds){
        try{
            Thread.sleep(milliSeconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void dropdownText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void dropdownValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void dropdownIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void comboBox(List<WebElement> list, String select){
        for(int i=1; i<list.size(); i++){
            if(list.get(i).getText().contains(select)){
                list.get(i).click();
            }
        }
    }

    public int dropdownOptions(WebElement element){
        Select select = new Select(element);
        return select.getOptions().size();
    }

    public boolean elementExists(WebElement element){ return element.isDisplayed();}
    public String getPageTitle(){ return driver.getTitle();}
    public void navigateBack(){ driver.navigate().back();}
    public void navigateFront(){ driver.navigate().forward();}
    public String getPageURL(){ return driver.getCurrentUrl();}


}