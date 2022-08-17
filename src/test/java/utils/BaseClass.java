package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    private String url;
    private String browserName;
    WebDriver driver;
    static Properties properties;

    @BeforeClass
    public void launchBrowser() throws IOException {
        switch (getProperty(browserName)){
            case "chrome":
                driver = new ChromeDriver();
            break;
            case "ie":
                driver = new InternetExplorerDriver();
            break;
            default:
                System.out.println("Setting chrome as default since there are no browser names provided as input.");
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

}
