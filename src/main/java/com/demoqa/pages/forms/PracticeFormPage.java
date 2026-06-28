package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.JavaScriptUtility;


public class PracticeFormPage extends FormsPage {

    public PracticeFormPage(WebDriver driver){
        super(driver);
    }
    private JavaScriptUtility javaScriptUtility = new JavaScriptUtility(driver);
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private  By submitButton = By.id("submit");

    public void clickFemaleRadioButton(){
         javaScriptUtility.scrollAndClickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            javaScriptUtility.scrollAndClickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            javaScriptUtility.scrollAndClickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            javaScriptUtility.scrollAndClickJS(musicHobbyCheckbox);
        }
    }

    public void unclickSportsCheckbox(){
        if(find(sportsHobbyCheckbox).isSelected()){
            javaScriptUtility.scrollAndClickJS(sportsHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }

    public void unclickReadingCheckbox(){
        if(find(readingHobbyCheckbox).isSelected()){
           javaScriptUtility.scrollAndClickJS(readingHobbyCheckbox);
        }
    }

    public void unclickMusicCheckbox(){
        if(find(musicHobbyCheckbox).isSelected()){
            javaScriptUtility.scrollAndClickJS(musicHobbyCheckbox);
        }
    }

    public  void clickSubmitButton(){
        click(submitButton);
    }
}
