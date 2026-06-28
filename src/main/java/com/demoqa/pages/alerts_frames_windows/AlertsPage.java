package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;


public class AlertsPage extends Alerts_Frames_WindowsPage{

    public AlertsPage(WebDriver driver){
        super(driver);
    }
    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private  By promptAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);


    public String getPromptAlertResult(){
        return find(promptResult).getText();
    }

    public void clickPromptAlertButton(){
        javaScriptUtility.scrollAndClickJS(promptAlertButton);
    }

    public  void clickInformationAlertButton(){
        javaScriptUtility.scrollAndClickJS(informationAlertButton);
    }

    public void clickConfirmationAlertButton(){
        javaScriptUtility.scrollAndClickJS(confirmationAlertButton);
    }

    public  String getConfirmationResult(){
        return find(confirmationResult).getText();
    }
}
