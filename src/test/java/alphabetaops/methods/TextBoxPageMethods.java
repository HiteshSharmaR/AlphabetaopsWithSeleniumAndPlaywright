package alphabetaops.methods;

import alphabetaops.objects.TextBoxPageObject;
import alphabetaops.steps.SeleniumHooks;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextBoxPageMethods {


    public static void enterIntoIframe(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement iframeElement = driver.findElement(TextBoxPageObject.I_FRAME_LOCATOR);
        wait.until(ExpectedConditions.presenceOfElementLocated(TextBoxPageObject.I_FRAME_LOCATOR));
        driver.switchTo().frame(iframeElement);
    }

    public static void enterDataIntoTextWithPlaceholder(WebDriver driver, String data) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextBoxPageObject.TEXT_WITH_PLACEHOLDER));
        WebElement textBox1= driver.findElement(TextBoxPageObject.TEXT_WITH_PLACEHOLDER);
        textBox1.sendKeys(data);
    }

    public static void clearDataInThePreFilledInput( WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextBoxPageObject.TEXT_PRE_FILLED_INPUT));
        driver.findElement(TextBoxPageObject.TEXT_PRE_FILLED_INPUT).clear();
    }

    public static void sendDataInThePreFilledInput( WebDriver driver, String data) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextBoxPageObject.TEXT_PRE_FILLED_INPUT));
        driver.findElement(TextBoxPageObject.TEXT_PRE_FILLED_INPUT).sendKeys(data);
    }

    public static void clickOnResettableInputButton(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(TextBoxPageObject.RESETTABLE_BUTTON));
        driver.findElement(TextBoxPageObject.RESETTABLE_BUTTON).click();
    }

    public static void enterDataInResettableInput(WebDriver driver, String data) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextBoxPageObject.RESETTABLE_TEXT_BOX));
        driver.findElement(TextBoxPageObject.RESETTABLE_TEXT_BOX).sendKeys(data);
    }

    public static void enterDataInRequiredField( WebDriver driver, String data) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextBoxPageObject.TEXT_REQUIRED_FIELD));
        driver.findElement(TextBoxPageObject.TEXT_REQUIRED_FIELD).sendKeys(data);
    }

    public static void enterDataInLimitedInputField(WebDriver driver, String data) {
        driver.findElement(TextBoxPageObject.LIMITED_LENGTH_TEXT_BOX).sendKeys(data);
    }
}
