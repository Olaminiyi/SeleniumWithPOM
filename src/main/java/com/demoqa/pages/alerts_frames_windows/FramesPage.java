package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.SwitchToUtility;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    public FramesPage(WebDriver driver){
        super(driver);
    }
    private By textInFrame = By.id("sampleHeading"); // the same id for the small frame
    private  String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");
    private SwitchToUtility switchToUtility = new SwitchToUtility(driver);


    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }
    private void switchToBigBox(){
        //driver.switchTo().frame(iFrameBigBox);
        switchToUtility.switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox(){
       // switchToFrameIndex(1);  // method for switching to frame with index
        switchToUtility.switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        //driver.switchTo().defaultContent(); // to switch out to the parent frames that contains the heading to be able to ge the heading
        switchToUtility.switchToDefaultContent();
        return  bigFrameText;
    }

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToUtility.switchToDefaultContent();
        return smallFrameText;
    }
}
