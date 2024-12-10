package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends com.example.selenium.pages.BasePage {

    // TODO define title and logout WebElements using @FindBy
    @FindBy(how = How.CSS, using="h2")
    private WebElement titleField;

    @FindBy(how = How.CSS, using=".icon-2x")
    private WebElement logoutButton ;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return titleField.getText();
    }

    public MainPage clickLogout() {
        logoutButton.click();
        return new MainPage(driver);
    }
}

/*
    assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Secure Area", "Login failed");
    driver.findElement(By.cssSelector(".icon-2x")).click();
    driver.close(
 */