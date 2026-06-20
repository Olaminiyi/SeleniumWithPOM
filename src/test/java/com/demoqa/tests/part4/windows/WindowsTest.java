package com.demoqa.tests.part4.windows;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

@Test
public class WindowsTest extends BaseTest {

    // YOU can handle new tab with the way you handle new windows
    public void testNewWindowURL() {
        var windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL,
                "\n Actual & Expected URL's Do Not Match \n");
    }
}