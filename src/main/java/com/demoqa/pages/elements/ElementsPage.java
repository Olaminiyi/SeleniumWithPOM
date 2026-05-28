package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    public webTablesPage clickWebtables() {

        click(webTablesMenuItem);
        return  new webTablesPage();
    }
}
