package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base {
    protected WebDriver driver;

    public base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}