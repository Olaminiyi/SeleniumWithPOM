package com.demoqa.pages.Widgets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DropDownUtility;
import utilities.JavaScriptUtility;
import java.util.List;


public class SelectMenuPage extends WidgetsPage{

    public SelectMenuPage(WebDriver driver){
        super(driver);
    }

    private DropDownUtility dropDownUtility = new DropDownUtility(driver);
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text){
        javaScriptUtility.scrollAndClickJS(standardMultiSelect);
//        Select select = new Select(find(standardMultiSelect));
//        select.selectByContainsVisibleText(text);
        dropDownUtility.selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int text){
        javaScriptUtility.scrollAndClickJS(standardMultiSelect);
        dropDownUtility.selectByIndex(standardMultiSelect, text);
    }

    public void deselectStandardMulti(String value){
        javaScriptUtility.scrollAndClickJS(standardMultiSelect);
        dropDownUtility.deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMultiOptions(){
        return dropDownUtility.getAllSelectedOptions(standardMultiSelect);
    }

}
