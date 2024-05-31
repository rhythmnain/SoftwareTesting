import org.example.DashBoard;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class adminTest {
    WebDriver driver;
    LoginPage loginPage;
    DashBoard dashboardPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.edge.driver", "D:/drivers/edgeDriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://admin-demo.nopcommerce.com/");
        loginPage = new LoginPage(driver);
        dashboardPage = new DashBoard(driver);
    }

    @Test
    public void testAdminLoginAndNavigate() {
        // Add title "Welcome to my Project3"
        System.out.println("Welcome to my Project3");

        // Login to the admin panel
        loginPage.login("admin@yourstore.com", "admin");

        // Click the back button
        dashboardPage.clickBackButton();

        // Add assertions here to verify successful navigation
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}