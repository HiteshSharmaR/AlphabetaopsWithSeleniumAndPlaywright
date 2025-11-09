package alphabetaops.methods;

import alphabetaops.objects.SimpleButtonPageObjects;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SimpleButtonPageMethods {
    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, java.time.Duration.ofSeconds(10));

    public static void switchToSimpleButtonIframe(WebDriver driver) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SimpleButtonPageObjects.I_FRAME_SIMPLE_BUTTON_LOCATOR));
        WebElement iframeElement = driver.findElement(SimpleButtonPageObjects.I_FRAME_SIMPLE_BUTTON_LOCATOR);
        driver.switchTo().frame(iframeElement);
    }

    public static void clickOnSimpleButton(WebDriver driver) {
        wait.until(ExpectedConditions.elementToBeClickable(SimpleButtonPageObjects.SIMPLE_BUTTON_LOCATOR));
        WebElement simpleButton = driver.findElement(SimpleButtonPageObjects.SIMPLE_BUTTON_LOCATOR);
        simpleButton.click();
    }

    public static void clickOnButtonUnderIFrame(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        java.util.List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        driver.switchTo().frame(iframes.get(0));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(SimpleButtonPageObjects.BUTTON_UNDER_IFRAME_LOCATOR));
        button.click();
    }

    public static void clickOnButtonUnderShadowDom(WebDriver driver) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(SimpleButtonPageObjects.SHADOW_DOM_LOCATOR));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement button = shadowRoot.findElement(SimpleButtonPageObjects.SHADOW_DOM_BUTTON_LOCATOR);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        button.click();
        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(SimpleButtonPageObjects.SHADOW_DOM_MESSAGE_LOCATOR));
        System.out.println("Message: " + msg.getText());
    }

    public static void switchBackToDefaultContent(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

    public static void clickOnThePseudoButton(WebDriver driver) {
        WebElement button = driver.findElement(SimpleButtonPageObjects.PSEUDO_BUTTON_LOCATOR);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String beforeContent = (String) js.executeScript("return window.getComputedStyle(arguments[0], '::before').getPropertyValue('color');", button);
        System.out.println("Before clicking, ::before color: " + beforeContent);
        button.click();
    }

    public static void hoverOverSimpleButton(WebDriver driver) {
        WebElement simpleButton = driver.findElement(SimpleButtonPageObjects.HOVER_BUTTON_LOCATOR);
        Actions actions = new Actions(driver);
        actions.moveToElement(simpleButton).perform();
    }
}