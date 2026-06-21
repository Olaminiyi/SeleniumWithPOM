package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/a[contains(@class, router-link)]/span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");
    private By textBoxMenuItem = By.xpath("//li[@id='item-0']//span[text()='Text Box']");

    public TextBoxPage clickTextBox(){
        scrollAndClickJS(textBoxMenuItem);
        return new TextBoxPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        scrollAndClickJS(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

    public webTablesPage clickWebtables() {

        click(webTablesMenuItem);
        return  new webTablesPage();
    }

    public LinksPage clickLinks(){
        click(linksMenuItem);
        return  new LinksPage();
    }
}
