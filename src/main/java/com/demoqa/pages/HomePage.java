package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formscard = By.xpath("//h5[contains(.,'Forms')]");


    public FormsPage gotoForms() {
        scrollToElementJS(formscard);
       // click(formscard);
        return  new FormsPage();
    }


}
