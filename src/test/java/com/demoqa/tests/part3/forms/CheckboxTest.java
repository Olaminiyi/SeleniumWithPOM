package com.demoqa.tests.part3.forms;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox(){
        var formspage = homePage.gotoForms().clickPracticeForm();
        formspage.clickSportsCheckbox();
        formspage.clickReadingCheckbox();
        formspage.clickMusicCheckbox();
        formspage.unclickReadingCheckbox();

        boolean isReadingCheckboxSelected = formspage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected,
                "\n Reading Checkbox is selected\n");

    }
}
