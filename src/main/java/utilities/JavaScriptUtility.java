package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptUtility extends Utility {


    public JavaScriptUtility(WebDriver driver) {
        super(driver);
    }

    public
    void scrollAndClickJS(By locator){

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(locator)
        );

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                element
        );

        js.executeScript("arguments[0].click();", element);
    }

    public void clickJS(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void scrollToElementJS(By locator){

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(locator)
        );

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                element
        );

    }


}