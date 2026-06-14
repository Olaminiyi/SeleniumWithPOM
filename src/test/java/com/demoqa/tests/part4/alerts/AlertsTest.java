package com.demoqa.tests.part4.alerts;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlerts(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages Do Not Match \n");
        acceptAlert(); // if you need to perform an action after the alert, make sure you accept the alert
    }

    public void testConfirmationAlert(){
        var alertPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You Did Not Select Cancel \n");
    }

    public void testPromptAlert(){
        String alertText = "Selenium With Java";
        String expectedResult = "You entered " + alertText;
        var alertPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertPage.getPromptAlertResult();
        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual & Expected Result Do Not Match \n");

    }
}
