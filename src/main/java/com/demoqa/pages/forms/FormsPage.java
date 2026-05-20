package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class FormsPage extends HomePage {

    private By practiceForMenuItem = By.xpath("//span[contains(.,'Practice Form')]");

    public PracticeFormPage clickPracticeForm(){
        scrollAndClickJS(practiceForMenuItem);
        return new PracticeFormPage();
    }
}
