package com.demoqa.pages;

import com.demoqa.pages.Widgets.WidgetsPage;
import com.demoqa.pages.alerts_frames_windows.Alerts_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;

public class HomePage extends BasePage {

    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private By formscard = By.xpath("//h5[contains(.,'Forms')]");
    private By elementsCard = By.xpath("//div[@id='root']//h5[text()='Elements']");
    private  By widgetsCard = By.xpath("//div[@id='root']//h5[text()='Widgets']");
    private By alertsFrameWindowsCard = By.xpath("//div[@id='root']//h5[contains(text(),'Alerts')]");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public FormsPage gotoForms() {
        javaScriptUtility.scrollAndClickJS(formscard);
       // click(formscard);
        return  new FormsPage(driver);
    }

    public ElementsPage goToElements(){
        javaScriptUtility.scrollAndClickJS(elementsCard);
        return new ElementsPage(driver);
    }

    public  WidgetsPage goToWidgets(){
        javaScriptUtility.scrollAndClickJS(widgetsCard);
        return new WidgetsPage(driver);
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindowsCard(){
        javaScriptUtility.scrollAndClickJS(alertsFrameWindowsCard);
        return new Alerts_Frames_WindowsPage(driver);
    }

}
