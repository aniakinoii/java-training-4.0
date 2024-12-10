package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v128.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    // TODO define username, password, and login WebElements using @FindBy
    @FindBy(how = How.ID, using="username")
    private WebElement usernameField;

    @FindBy(how = How.ID, using="password")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using=".fa")
    private WebElement loginButton ;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        usernameField.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        passwordField.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        loginButton.click();
        return new MainPage(driver);
    }
}
/*
driver.manage().window().setSize(new Dimension(840, 1027));
driver.findElement(By.id("username")).sendKeys("tomsmith");
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
driver.findElement(By.cssSelector(".fa")).click();
 */