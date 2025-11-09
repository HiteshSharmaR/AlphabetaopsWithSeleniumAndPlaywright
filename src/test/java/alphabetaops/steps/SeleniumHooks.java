package alphabetaops.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SeleniumHooks {
    public static WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.alphabetaops.com/");
        driver.manage().window().maximize();
    }

    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}