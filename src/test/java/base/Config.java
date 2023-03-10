package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Config {
    //int driver
    public static WebDriver driver ;

    // setup browser
    public static WebDriver SetupBrowser(String driverType) {
        if (driverType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromiumdriver().setup();
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
        return driver;
    }
}