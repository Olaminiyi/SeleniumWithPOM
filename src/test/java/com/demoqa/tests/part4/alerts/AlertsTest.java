package com.demoqa.tests.part4.alerts;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlerts(){
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages Do Not Match \n");
        acceptAlert(); // if you need to perform an action after the alert, make sure you accept the alert
    }
}
