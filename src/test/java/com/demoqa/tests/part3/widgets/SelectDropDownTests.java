package com.demoqa.tests.part3.widgets;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class SelectDropDownTests extends BaseTest {

    @Test
    public  void testMultiSelectDropDown(){
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");

    }
}

