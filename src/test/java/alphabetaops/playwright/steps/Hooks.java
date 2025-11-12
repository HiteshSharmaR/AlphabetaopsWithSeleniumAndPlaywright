package alphabetaops.playwright.steps;

import alphabetaops.playwright.methods.PlayWrightLeftMenuMethods;
import com.microsoft.playwright.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Arrays;

public class Hooks {
    protected static Playwright playwright;
    protected static Browser browser;
    public static Page page;

    @BeforeClass
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(Arrays.asList("--start-maximized")));
        page = browser.newPage();
        page.navigate("https://alphabetaops.com/");
        System.out.println("Page title: " + page.title());
    }

    @AfterClass
    public void tearDown() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
