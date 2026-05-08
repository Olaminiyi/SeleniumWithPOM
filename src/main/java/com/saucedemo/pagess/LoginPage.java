package com.saucedemo.pagess;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("#login_button_container h3");


    public By getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(By usernameField) {
        this.usernameField = usernameField;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(By passwordField) {
        this.passwordField = passwordField;
    }

    public By getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(By loginButton) {
        this.loginButton = loginButton;
    }

    public By getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(By errorMessage) {
        this.errorMessage = errorMessage;
    }
}
