package com.demoqa.tests.part4.interactions;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard(){
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Neyo Be");
        textBoxPage.setEmail("neyobe@gmail.com");
        textBoxPage.setCurrentAddress("Number 10");
        textBoxPage.setCurrentAddress("Goodman Square");
        textBoxPage.setCurrentAddress("NR2 4LA");
        textBoxPage.setCurrentAddress("Norwich");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Goodman Square"),
                "\n Actual Address Does Not Contain Goodman Square \n");
    }
}
