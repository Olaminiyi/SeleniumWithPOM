package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.GetUtility;
import utilities.WaitUtility;


public class DynamicPropertiesPage extends ElementsPage{

    private GetUtility getUtility = new GetUtility(driver);
    private WaitUtility waitUtility = new WaitUtility(driver);
    public DynamicPropertiesPage(WebDriver driver){
        super(driver);
    }

    private  By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText(){
        waitUtility.explicitWaitUntilVisible(5, visibleAfterButton);
        String visibleText = getUtility.getText(visibleAfterButton);
        System.out.println("Button Text: " + visibleText);
        return visibleText;
    }
}
