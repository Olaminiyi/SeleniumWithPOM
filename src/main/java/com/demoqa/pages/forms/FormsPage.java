package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;


public class FormsPage extends HomePage {

    public FormsPage(WebDriver driver){
        super(driver);
    }

    private By practiceForMenuItem = By.xpath("//span[contains(.,'Practice Form')]");
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);

    public PracticeFormPage clickPracticeForm(){
        javaScriptUtility.scrollAndClickJS(practiceForMenuItem);
        return new PracticeFormPage(driver);
    }
}
