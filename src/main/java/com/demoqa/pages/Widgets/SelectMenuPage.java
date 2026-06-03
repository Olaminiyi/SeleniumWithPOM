package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollAndClickJS;

public class SelectMenuPage extends WidgetsPage{

    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text){
        scrollAndClickJS(standardMultiSelect);
//        Select select = new Select(find(standardMultiSelect));
//        select.selectByContainsVisibleText(text);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMulti(int text){
        scrollAndClickJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, text);
    }

    public void deselectStandardMulti(String value){
        scrollAndClickJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }
}
