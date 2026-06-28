package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;


public class ElementsPage extends HomePage {

    public  ElementsPage(WebDriver driver){
        super(driver);
    }

    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/a[contains(@class, router-link)]/span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");
    private By textBoxMenuItem = By.xpath("//li[@id='item-0']//span[text()='Text Box']");

    public TextBoxPage clickTextBox(){
        javaScriptUtility.scrollAndClickJS(textBoxMenuItem);
        return new TextBoxPage(driver);
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        javaScriptUtility.scrollAndClickJS(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage(driver);
    }

    public webTablesPage clickWebtables() {

        click(webTablesMenuItem);
        return  new webTablesPage(driver);
    }

    public LinksPage clickLinks(){
        click(linksMenuItem);
        return  new LinksPage(driver);
    }
}
