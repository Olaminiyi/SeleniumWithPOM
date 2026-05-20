package com.demoqa.tests.part3.forms;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadiobutton(){
        var formsPage = homePage.gotoForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
    }
}
