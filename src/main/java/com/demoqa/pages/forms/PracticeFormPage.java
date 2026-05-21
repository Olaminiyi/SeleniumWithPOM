package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollAndClickJS;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");

    public void clickFemaleRadioButton(){
        scrollAndClickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrollAndClickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            scrollAndClickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrollAndClickJS(musicHobbyCheckbox);
        }
    }

    public void unclickSportsCheckbox(){
        if(find(sportsHobbyCheckbox).isSelected()){
            scrollAndClickJS(sportsHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }

    public void unclickReadingCheckbox(){
        if(find(readingHobbyCheckbox).isSelected()){
            scrollAndClickJS(readingHobbyCheckbox);
        }
    }

    public void unclickMusicCheckbox(){
        if(find(musicHobbyCheckbox).isSelected()){
            scrollAndClickJS(musicHobbyCheckbox);
        }
    }
}
