package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ReporterClass {

    public static ExtentSparkReporter sparkReporter;
    public static ExtentReports extentReports;
    public ExtentTest extentTest;

    @BeforeSuite
    public void startReport(){
        sparkReporter = new ExtentSparkReporter("D:\\Selenium\\Practice Sessions\\Framework\\Selenium Frameworks\\TestNG\\test-one\\reports\\extentHTMLReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    public void createTest(String testName){
        extentTest = extentReports.createTest(testName);
    }

    public void stepPass(String stepName){
        extentTest.pass(stepName);
    }

    public void stepFail(String stepName){
        extentTest.fail(stepName);
    }

    public void stepInfo(String stepName){
        extentTest.info(stepName);
    }

    @AfterSuite
    public void stopReport(){
        extentReports.flush();
    }

}
