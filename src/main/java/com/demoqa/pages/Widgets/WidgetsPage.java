package com.demoqa.pages.Widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class WidgetsPage extends HomePage {

    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");

    public SelectMenuPage clickSelectMenu(){
        scrollAndClickJS(selectMenuItem);

        return new SelectMenuPage();
    }
}
