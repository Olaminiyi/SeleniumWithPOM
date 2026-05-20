package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class HomePage extends BasePage {

    private By formscard = By.xpath("//h5[contains(.,'Forms')]");


    public FormsPage gotoForms() {
        scrollAndClickJS(formscard);
       // click(formscard);
        return  new FormsPage();
    }


}
