//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //SET1
        System.setProperty("webdriver.chrome.driver","D://drivers//chromedriver-win64//chromedriver.exe/");
        //open the browser
       WebDriver chromedriver= new ChromeDriver();

       //navigate to url
        chromedriver.get("https://www.google.com");

        //close the web browser
        chromedriver.close();

        //SET 2

        System.setProperty("webdriver.edge.driver", "D:/drivers/edgeDriver/msedgedriver.exe");

        // Initialize a new instance of the Edge driver
        WebDriver edgeDriver= new EdgeDriver();

        // Navigate to URL
        edgeDriver.get("https://www.google.com");

        // Close the web browser
        edgeDriver.close();

    }
}

