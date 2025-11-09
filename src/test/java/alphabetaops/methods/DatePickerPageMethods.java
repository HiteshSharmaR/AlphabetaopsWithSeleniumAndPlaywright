package alphabetaops.methods;


import alphabetaops.objects.DatePickerPageObjects;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePickerPageMethods {

    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, Duration.ofSeconds(10));

    public static void switchToDateAndTimeIframe(WebDriver driver) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DatePickerPageObjects.I_FRAME_DATE_PICKER_LOCATOR));
        WebElement iframeElement = driver.findElement(DatePickerPageObjects.I_FRAME_DATE_PICKER_LOCATOR);
        wait.until(ExpectedConditions.presenceOfElementLocated(DatePickerPageObjects.I_FRAME_DATE_PICKER_LOCATOR));
        driver.switchTo().frame(iframeElement);
    }

    public static void htmlDatePickerMethod(WebDriver driver, String date) {
        WebElement dateTimeInput = wait.until(ExpectedConditions.elementToBeClickable(DatePickerPageObjects.HTML_DATE_TIME_PICKER_LOCATOR));
        dateTimeInput.clear();
        dateTimeInput.sendKeys(date);
        dateTimeInput.sendKeys(Keys.ARROW_UP);
    }

    public static void selectDateInPreFilledDateAndTime(WebDriver driver, String date) {
        WebElement dateTimeInput = wait.until(ExpectedConditions.elementToBeClickable(DatePickerPageObjects.PRE_SELECTED_DATE_PICKER_LOCATOR));
        dateTimeInput.clear();
        dateTimeInput.sendKeys(date);
        dateTimeInput.sendKeys(Keys.ARROW_UP);
    }

    public static void selectDateInRequiredDateAndTIme(WebDriver driver, String date) {
        WebElement dateTimeInput = wait.until(ExpectedConditions.elementToBeClickable(DatePickerPageObjects.REQUIRED_DATE_PICKER_LOCATOR));
        dateTimeInput.clear();
        dateTimeInput.sendKeys(date);
        dateTimeInput.sendKeys(Keys.ARROW_UP);
    }

    public static void selectDateInMinMaxTime(WebDriver driver, String date) {
        WebElement dateTimeInput = wait.until(ExpectedConditions.elementToBeClickable(DatePickerPageObjects.DATE_PICKER_WITH_MIN_MAX_LOCATOR));
        dateTimeInput.clear();
        dateTimeInput.sendKeys(date);
        dateTimeInput.sendKeys(Keys.ARROW_UP);
    }
}