package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import static com.saucedemo.pages.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected  String DEMO_URL = "https://demoqa.com/";


    @BeforeClass
    public void SetUp(){
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(DEMO_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
       // setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown(){
       // delay(3000);
        driver.quit();
    }


}
