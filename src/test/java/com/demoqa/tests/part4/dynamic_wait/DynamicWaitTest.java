package com.demoqa.tests.part4.dynamic_wait;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButtonText(){
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText, "\n Actual & Expected do not Match\n");
    }
}
