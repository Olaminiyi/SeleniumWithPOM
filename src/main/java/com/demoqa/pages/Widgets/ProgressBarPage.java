package com.demoqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.GetUtility;
import utilities.WaitUtility;

public class ProgressBarPage extends WidgetsPage{

    public ProgressBarPage(WebDriver driver){
        super(driver);
    }

    private WaitUtility waitUtility = new WaitUtility(driver);
    private GetUtility getUtility = new GetUtility(driver);
    private By startButton = By.id("startStopButton");
    private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public String getProgressValue(){
        waitUtility.fluentWaitUntilVisible(30, progressValue);
        return getUtility.getText(progressValue);
    }

    public void clickStartButton(){
        click(startButton);
    }
}
