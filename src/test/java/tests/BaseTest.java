package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Properties;
import utils.ConfigReader;

public class BaseTest {
    public WebDriver driver;
    public Properties prop;

    @BeforeMethod
    public void setup() {
        prop = ConfigReader.initProperties();

        String browser = prop.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
