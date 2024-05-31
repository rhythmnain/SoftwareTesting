////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException{
//
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver-win64/chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.facebook.com");
//driver.manage().window().maximize();
//WebElement day_d = driver.findElement(By.id("day"));
//Select oSelect = new Select(day_d);
//Thread.sleep(3000);
//oSelect.selectByIndex(6);
//WebElement month_m = driver.findElement(By.id("month"));
//Select month_m1 = new Select(month_m);
//Thread.sleep(3000);
//month_m1.selectByVisibleText("Aug");
//WebElement year_y = driver.findElement(By.id("year"));
//Select year_y1 = new Select(year_y);
//Thread.sleep(3000);
//year_y1.selectByValue("2024");
//
//    }
//}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/emailsignup/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for and find the sign-up elements
        WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("emailOrPhone")));
        WebElement fullNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("fullName")));
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));

        // Fill in the form fields
        emailField.sendKeys("demoemail@example.com");
        fullNameField.sendKeys("Project QA");
        usernameField.sendKeys("demousername");
        passwordField.sendKeys("password@123");

        // Submit the form
        WebElement signUpButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        signUpButton.click();

        // Wait for some time to observe the result
        try {
            Thread.sleep(5000); // 5 seconds sleep for demo purposes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
//        driver.quit();
    }
}
