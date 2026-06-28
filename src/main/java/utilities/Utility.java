package utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    protected WebDriver driver;

    public Utility(WebDriver driver){
        this.driver = driver;
    }

    public void setUtilityDriver(WebDriver driver){
        this.driver = driver;

    }
}
