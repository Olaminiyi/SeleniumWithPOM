package com.demoqa.tests.part3.elements;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebtable(){
        String email = "kierra@example.com";
        String expectedAge = "34";
        var webTablePage = homePage.goToElements().clickWebtables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge, "\n Actual & Expected Ages do not Match  \n");
    }
}
