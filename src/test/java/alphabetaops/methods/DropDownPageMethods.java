package alphabetaops.methods;

import alphabetaops.objects.DropDownPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPageMethods {
    public static WebDriverWait wait = new WebDriverWait(alphabetaops.steps.SeleniumHooks.driver, java.time.Duration.ofSeconds(10));
    public static void switchToDropDownIframe(WebDriver driver) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(alphabetaops.objects.DropDownPageObjects.I_FRAME_DROPDOWN_LOCATOR));
        WebElement iframeElement = driver.findElement(alphabetaops.objects.DropDownPageObjects.I_FRAME_DROPDOWN_LOCATOR);
        driver.switchTo().frame(iframeElement);
    }

    public static void selectValueInSimpleSelectDropDown(WebDriver driver, String valueToSelect){
        wait.until(ExpectedConditions.elementToBeClickable(DropDownPageObjects.SIMPLE_DROPDOWN_LOCATOR));
        WebElement simpleDropDown = driver.findElement(DropDownPageObjects.SIMPLE_DROPDOWN_LOCATOR);
        Select select = new Select(simpleDropDown);
        select.selectByVisibleText(valueToSelect);
    }

    public static void selectValueInDropDownWithDefaultSelectedOption(WebDriver driver, String valueToSelect){
        wait.until(ExpectedConditions.elementToBeClickable(DropDownPageObjects.DROPDOWN_WITH_DEFAULT_SELECTED_OPTION_LOCATOR));
        WebElement dropDownWithDefaultSelectedOption = driver.findElement(DropDownPageObjects.DROPDOWN_WITH_DEFAULT_SELECTED_OPTION_LOCATOR);
        Select select = new Select(dropDownWithDefaultSelectedOption);
        select.selectByVisibleText(valueToSelect);
    }

    public static void selectValueInRequiredDropDown(WebDriver driver, String valueToSelect){
        wait.until(ExpectedConditions.elementToBeClickable(DropDownPageObjects.REQUIRED_DROPDOWN_LOCATOR));
        WebElement requiredDropDown = driver.findElement(DropDownPageObjects.REQUIRED_DROPDOWN_LOCATOR);
        Select select = new Select(requiredDropDown);
        select.selectByVisibleText(valueToSelect);
    }

    public static void selectValueInGroupedDropDown(WebDriver driver, String valueToSelect){
        wait.until(ExpectedConditions.elementToBeClickable(DropDownPageObjects.GROUPED_DROPDOWN_LOCATOR));
        WebElement groupedDropDown = driver.findElement(DropDownPageObjects.GROUPED_DROPDOWN_LOCATOR);
        Select select = new Select(groupedDropDown);
        select.selectByVisibleText(valueToSelect);
    }

    public static void selectValueInResettableDropDown(WebDriver driver, String valueToSelect){
        wait.until(ExpectedConditions.elementToBeClickable(DropDownPageObjects.RESETTABLE_DROPDOWN_LOCATOR));
        WebElement resettableDropDown = driver.findElement(DropDownPageObjects.RESETTABLE_DROPDOWN_LOCATOR);
        Select select = new Select(resettableDropDown);
        select.selectByVisibleText(valueToSelect);
    }
}
