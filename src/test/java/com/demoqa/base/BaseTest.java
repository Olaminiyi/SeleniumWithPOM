package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.GetUtility;
import utilities.SwitchToUtility;
import utilities.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import static com.base.BasePage.delay;


public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected Utility utility;
    protected GetUtility getUtility;
    protected SwitchToUtility switchToUtility;
    protected  String DEMO_URL = "https://demoqa.com/";


    @BeforeClass
    public void setUp(){
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        utility = new Utility(driver);
        getUtility = new GetUtility(driver);
        switchToUtility = new SwitchToUtility(driver);
   //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeMethod
    public void loadApplication(){

        driver.get(DEMO_URL);
        basePage = new BasePage(driver);
        basePage.setDriver(driver);
        utility.setUtilityDriver(driver);
        homePage = new HomePage(driver);

    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult){
        if (ITestResult.FAILURE == testResult.getStatus()){
           TakesScreenshot screenshot  = (TakesScreenshot) driver;
           File source = screenshot.getScreenshotAs(OutputType.FILE);
           File destination = new File(System.getProperty("user.dir") +
                   "/resources/screenshots/(" +

                   java.time.LocalDate.now() +
        java.time.LocalDate.now() + ")" +

                   testResult.getName() + " .png");
            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located At " + destination); //optional
        }
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }


}
