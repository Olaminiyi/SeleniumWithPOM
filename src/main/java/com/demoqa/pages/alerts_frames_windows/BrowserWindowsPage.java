package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;
import utilities.SwitchToUtility;
import java.util.Set;


public class BrowserWindowsPage extends Alerts_Frames_WindowsPage{

    public BrowserWindowsPage(WebDriver driver){
        super(driver);
    }
    private By newWindowButton = By.id("windowButton");
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private SwitchToUtility switchToUtility = new SwitchToUtility(driver);

    public void clickNewWindowButton(){
        javaScriptUtility.scrollAndClickJS(newWindowButton);
    }

    public void switchToNewWindow(){
        // Step 1: Get The Current "Main" Window Handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle +"\n");

        //Step 2: Get All Window Handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Number of Open Windows: " + allHandles.size());

        for (String handle : allHandles){
            if(currentHandle.equals(handle)){
                System.out.println("1st Window ID: " + handle);
            } else {
                 switchToUtility.switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }

        //Step 3: Switch To The New Window Using The Window Handle
    }
}
