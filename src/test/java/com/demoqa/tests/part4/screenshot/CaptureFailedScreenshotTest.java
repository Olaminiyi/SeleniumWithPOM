package com.demoqa.tests.part4.screenshot;

<<<<<<< HEAD
public class CaptureFailedScreenshotTest {
=======
import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor(){
        var practiceFormPage = homePage.gotoForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
>>>>>>> df2f21c (Added modal test)
}
