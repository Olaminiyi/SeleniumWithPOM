package com.demoqa.pages.Widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;


public class WidgetsPage extends HomePage {

    public WidgetsPage(WebDriver driver){
        super(driver);
    }

    private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']/a[@class='router-link']/span[text()='Date Picker']");
    private  By progressBarMenuItem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']//span[text()='Slider']");
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);

    public SliderPage clickSlider(){
        javaScriptUtility.scrollAndClickJS(sliderMenuItem);
        return new SliderPage(driver);
    }

    public ProgressBarPage clickProgressBar(){
        javaScriptUtility.scrollAndClickJS(progressBarMenuItem);
        return new ProgressBarPage(driver);
    }

    public SelectMenuPage clickSelectMenu(){
        javaScriptUtility.scrollAndClickJS(selectMenuItem);

        return new SelectMenuPage(driver);
    }

    public DatePickerMenuPage clickDatePicker() {
        javaScriptUtility.scrollAndClickJS(datePickerMenuItem);
        return  new DatePickerMenuPage(driver);
    }
}
