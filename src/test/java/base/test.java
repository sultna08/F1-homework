package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        System.setProperty("web driver.chrome.driver","G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://qa.taltektc.com";
        String expectedTitle = "Welcome:taltektc homepage ";
        String actualTitle ="";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();
    }

}

