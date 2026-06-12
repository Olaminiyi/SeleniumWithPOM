package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class ModalDialogsPage extends Alerts_Frames_WindowsPage{

    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(),'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton(){
        scrollAndClickJS(smallModalButton);
    }

    public String getSmallModalText(){
        return  find(smallModalText).getText();
    }

    public  void clickCloseButton(){
        scrollAndClickJS(closeButton);
    }

}
