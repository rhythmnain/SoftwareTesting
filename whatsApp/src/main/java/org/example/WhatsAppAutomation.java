package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WhatsAppAutomation {

    public static void main(String[] args) {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize Chrome driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open WhatsApp Web
            driver.get("https://web.whatsapp.com/");

            // Wait for the user to scan the QR code
            Thread.sleep(20000); // Adjust the sleep time as needed to allow for QR code scanning

            // Search for the contact
            WebElement searchBox = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
            searchBox.sendKeys("MIM10010");
            Thread.sleep(5000); // Wait for search results to load

            // Select the contact
            WebElement contact = driver.findElement(By.xpath("//span[@title='MIM10010']"));
            contact.click();
            Thread.sleep(2000); // Wait for the chat to open

            // Send a text message
            WebElement messageBox = driver.findElement(By.xpath("//div[@title='Type a message']"));
            messageBox.sendKeys("Hello, this is an automated message.");
            WebElement sendButton = driver.findElement(By.xpath("//button[@data-testid='compose-btn-send']"));
            sendButton.click();
            Thread.sleep(2000); // Wait for the message to be sent

            // Send an image
            WebElement attachButton = driver.findElement(By.xpath("//span[@data-testid='clip']"));
            attachButton.click();
            Thread.sleep(2000); // Wait for the attach options to appear

            WebElement attachFileInput = driver.findElement(By.xpath("//input[@type='file']"));
            attachFileInput.sendKeys("C:\\path\\to\\your\\image.jpg"); // Change to the path of your image file
            Thread.sleep(2000); // Wait for the image to be uploaded

            WebElement sendImageButton = driver.findElement(By.xpath("//span[@data-testid='send']"));
            sendImageButton.click();
            Thread.sleep(2000); // Wait for the image to be sent
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the driver
            driver.quit();
        }
    }
}
