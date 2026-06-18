package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrame = By.id("sampleHeading"); // the same id for the small frame
    private  String iFrameBigBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");


    public String getHeaderFramesText(){
        return find(headerFramesText).getText();
    }
    private void switchToBigBox(){
        //driver.switchTo().frame(iFrameBigBox);
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox(){
       // switchToFrameIndex(1);  // method for switching to frame with index
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        //driver.switchTo().defaultContent(); // to switch out to the parent frames that contains the heading to be able to ge the heading
        switchToDefaultContent();
        return  bigFrameText;
    }

    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
