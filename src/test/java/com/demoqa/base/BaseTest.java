package com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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
        homePage = new HomePage();
        basePage.setDriver(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
