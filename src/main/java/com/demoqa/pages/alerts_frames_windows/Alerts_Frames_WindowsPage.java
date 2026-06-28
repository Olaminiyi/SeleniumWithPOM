package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;


public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private  By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private  By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
    private By browserWindowsMenuItem = By.xpath("//li[@id='item-0']//span[text()='Browser Windows']");
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);

   public Alerts_Frames_WindowsPage(WebDriver driver){
       super(driver);
   }

    public BrowserWindowsPage clickBrowserWindows(){
        javaScriptUtility.scrollAndClickJS(browserWindowsMenuItem);
        return new BrowserWindowsPage(driver);
    }

    public FramesPage clickFrames(){
        javaScriptUtility.scrollAndClickJS(framesMenuItem);
        return new FramesPage(driver);
    }


    public  AlertsPage clickAlerts(){
        javaScriptUtility.scrollAndClickJS(alertsMenuItem);
        return new AlertsPage(driver);
    }

    public ModalDialogsPage clickModalDialogs(){
        javaScriptUtility.scrollAndClickJS(modalDialogsMenuItem);
        return new ModalDialogsPage(driver);
    }
}
