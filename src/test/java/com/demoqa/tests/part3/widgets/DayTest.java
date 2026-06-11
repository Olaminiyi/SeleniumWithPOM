package com.demoqa.tests.part3.widgets;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DayTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "December";
        String monthNumber = "12";
        String day = "20";
        String year = "2030";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate,
                "\n Actual & Expected Dates Do Not Match" +
                       "\nActual Date: " + actualDate +
                        "\n Expected Date:  " + expectedDate + "\n");
    }

}
