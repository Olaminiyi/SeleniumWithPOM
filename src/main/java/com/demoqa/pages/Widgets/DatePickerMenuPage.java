package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.scrollAndClickJS;

public class DatePickerMenuPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private  By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day){
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day){
        scrollAndClickJS(dayValue(day));
    }

    public boolean isDayinMonth(String day){
        return  find(dayValue(day)).isDisplayed();
    }

    public void clickSelectDate(){
        scrollAndClickJS(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year){
        selectByVisibleText(yearDropDown, year);
    }

}
