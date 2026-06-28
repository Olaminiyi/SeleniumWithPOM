package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ActionsUtility;
import utilities.GetUtility;



public class SliderPage extends WidgetsPage{

    protected GetUtility utility = new GetUtility(driver);
    protected ActionsUtility actionsUtility = new ActionsUtility(driver);

    public SliderPage(WebDriver driver){
        super(driver);
    }

    private  By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private  By sliderValue = By.id("sliderValue");

    public String getSliderValue(){
        return utility.getAttribute(sliderValue, "value");
}

    public void moveSlider(int x, int y){
  //  Actions act = new Actions(driver);
  //  act.dragAndDropBy(find(slider), x, y).perform();
       actionsUtility.dragAndDropBy(find(slider), x, y);

}
}
