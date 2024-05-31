package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard extends base {

    private By backButton = By.cssSelector("button.back-button");

    public DashBoard(WebDriver driver) {
        super(driver);
    }

    public void clickBackButton() {
        driver.findElement(backButton).click();
    }
}
