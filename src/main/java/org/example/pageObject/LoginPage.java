package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        LoginPage.driver = driver;

    }

    @FindBy(xpath = "//input[@id='txt-username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='txt-password']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btn-login']")
    private WebElement loginButton;

    public boolean verifyOnLoginPage() {
        return username.isDisplayed() && password.isDisplayed() && loginButton.isDisplayed();
    }

    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }
    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }





}
