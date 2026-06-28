package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage{

    public ModalDialogsPage(WebDriver driver){
        super(driver);
    }
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton(){
        javaScriptUtility.scrollAndClickJS(smallModalButton);
    }

    public String getSmallModalText(){
        return  find(smallModalText).getText();
    }

    public  void clickCloseButton(){
        javaScriptUtility.scrollAndClickJS(closeButton);
    }

}
