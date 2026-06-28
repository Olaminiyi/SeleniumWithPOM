package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ActionsUtility;
import utilities.GetUtility;
import utilities.JavaScriptUtility;
import utilities.WaitUtility;


public class TextBoxPage extends ElementsPage{

    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private GetUtility getUtility = new GetUtility(driver);
    private ActionsUtility actionsUtility = new ActionsUtility(driver);
    private WaitUtility waitUtility = new WaitUtility(driver);

    public TextBoxPage(WebDriver driver){
        super(driver);
    }

    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress'] ");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress(){
        waitUtility.explicitWaitUntilVisible(5, currentAddressResult);
        return getUtility.getText(currentAddressResult);
    }

    public void clickSubmitButton(){
        javaScriptUtility.scrollAndClickJS(submitButton);
    }

    // testing using enter to enter multiple line of words
    public void setCurrentAddress(String address){
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    // testing using TABS to go the next field instead of using locator
    public void setFullName(String name){
        javaScriptUtility.scrollToElementJS(fullNameField);
        actionsUtility.sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }
}
