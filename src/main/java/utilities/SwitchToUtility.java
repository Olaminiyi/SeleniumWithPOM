package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility{

    public SwitchToUtility(WebDriver driver){
        super(driver);
    }

    private WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
    }

    public String getAlertText(){
       return switchTo().alert().getText();
    }

    public void acceptAlert(){
        switchTo().alert().accept();
    }

    public void dismissAlert(){
        switchTo().alert().dismiss();
    }

    public void setAlertText(String text){
        switchTo().alert().sendKeys(text);
    }

    public void switchToFrameString(String value){
        switchTo().frame(value);
    }

    public void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public void switchToFrameIndex(int index) {
        switchTo().frame(index);
    }

    // if the ID or the name attribute is not present in the DOM, then we use switch to Frame with WebElement
    public void switchToFrameElement(WebElement element){
        switchTo().frame(element);
    }

    public void switchToWindow(String handle) {
        switchTo().window(handle);
    }
}
