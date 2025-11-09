package alphabetaops.playwright.steps;

import com.microsoft.playwright.*;
import org.junit.Before;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hooks {
    protected static Playwright playwright;
    protected static Page page;

    @BeforeMethod
    public static void setup(){
        Playwright playwright = Playwright.create();
        var browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.navigate("https://alphabetaops.com/");
        System.out.println("Page title: " + page.title());
    }
}
