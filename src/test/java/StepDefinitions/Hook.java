package stepDefinitions;
import io.cucumber.java.Before;

public class Hook extends Config {
    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = setupBrowser (driverType);
        switch (envType){
            case "qa":
                url = "https://qa.taltektc.com";
                Email_Address = "qa.env1@gmail.com";
                Password = "Test1234";
                break;
            case "stg":
                url = "http://www.stage.taltektc.com";
                Email_Address="stage.env1@gmail.com";
                Password = "Password";
                break;
            case "prod":
                url = "http://www.prod.taltektc.com";
                Email_Address="prod.env1@gmail.com";
                Password = "Test1234";
                break;
        }
        driver.get(url);
    }
    finally {
            driver.quit();
        }
    }
}
