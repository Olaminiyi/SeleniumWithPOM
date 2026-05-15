package utilities;

import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptUtility {

    public static void scrollToElementJS(By locator){

        WebDriverWait wait =
                new WebDriverWait(BasePage.driver, Duration.ofSeconds(10));

        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(locator)
        );

        JavascriptExecutor js =
                (JavascriptExecutor) BasePage.driver;

        js.executeScript(
                "arguments[0].scrollIntoView({block:'center'});",
                element
        );

        js.executeScript("arguments[0].click();", element);
    }
}