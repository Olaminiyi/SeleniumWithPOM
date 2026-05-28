package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class webTablesPage extends ElementsPage {

    private By registrationAgefield = By.id("age");
    private By submitButton = By.id("submit");

    public void clickEdit(String email){
        By edit = By.xpath("//table[contains(@class, '-striped')]//td[text()='"+ email +"']/following-sibling::td//span[@title='Edit']");
        click(edit);
    }

    public  void setAge(String age){
        set(registrationAgefield, age);
    }

    public void clickSubmitButton(){
        click(submitButton);
    }
}
