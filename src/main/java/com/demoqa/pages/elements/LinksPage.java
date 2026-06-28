package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;

public class LinksPage extends  ElementsPage{


    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    public LinksPage(WebDriver driver){
        super(driver);
    }

    private By badRequestLink = By.id("bad-request");
    private  By responseLink = By.id("linkResponse");

    public void clickBadRequestLink(){
        javaScriptUtility.scrollAndClickJS(badRequestLink);
    }

    public String getResponse() {
        delay(2000);
        return  find(responseLink).getText();
    }

}
