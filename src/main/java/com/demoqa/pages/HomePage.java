package com.demoqa.pages;

import com.demoqa.pages.Widgets.WidgetsPage;
import com.demoqa.pages.alerts_frames_windows.Alerts_Frames_WindowsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class HomePage extends BasePage {

    private By formscard = By.xpath("//h5[contains(.,'Forms')]");
    private By elementsCard = By.xpath("//div[@id='root']//h5[text()='Elements']");
    private  By widgetsCard = By.xpath("//div[@id='root']//h5[text()='Widgets']");
    private By alertsFrameWindowsCard = By.xpath("//div[@id='root']//h5[contains(text(),'Alerts')]");

    public FormsPage gotoForms() {
        scrollAndClickJS(formscard);
       // click(formscard);
        return  new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollAndClickJS(elementsCard);
        return new ElementsPage();
    }

    public  WidgetsPage goToWidgets(){
        scrollAndClickJS(widgetsCard);
        return new WidgetsPage();
    }

    public Alerts_Frames_WindowsPage goToAlertsFramesWindowsCard(){
        scrollAndClickJS(alertsFrameWindowsCard);
        return new Alerts_Frames_WindowsPage();
    }

}
