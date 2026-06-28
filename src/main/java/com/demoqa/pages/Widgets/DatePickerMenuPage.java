package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DropDownUtility;
import utilities.JavaScriptUtility;

public class DatePickerMenuPage extends WidgetsPage {

    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private DropDownUtility dropDownUtility = new DropDownUtility(driver);

    public DatePickerMenuPage(WebDriver driver){
        super(driver);
    }

    private By selectDateField = By.id("datePickerMonthYearInput");
    private  By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day){
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day){
        javaScriptUtility.scrollAndClickJS(dayValue(day));
    }

    public boolean isDayinMonth(String day){
        return  find(dayValue(day)).isDisplayed();
    }

    public void clickSelectDate(){
        javaScriptUtility.scrollAndClickJS(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
       dropDownUtility.selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year){
      dropDownUtility.selectByVisibleText(yearDropDown, year);
    }

}
