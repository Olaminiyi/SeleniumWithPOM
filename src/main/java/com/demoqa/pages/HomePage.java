package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By formscard = By.xpath("//div[@id='root']//h5[text()='Forms']");

    public FormsPage gotoForms() {
        click(formscard);
        return  new FormsPage();
    }

}
