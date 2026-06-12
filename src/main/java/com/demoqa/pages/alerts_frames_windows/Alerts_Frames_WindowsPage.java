package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private  By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");

    public  AlertsPage clickAlerts(){
        scrollAndClickJS(alertsMenuItem);
        return new AlertsPage();
    }

    public ModalDialogsPage clickModalDialogs(){
        scrollAndClickJS(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
