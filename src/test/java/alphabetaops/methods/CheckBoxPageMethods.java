package alphabetaops.methods;

import alphabetaops.objects.CheckBoxPageObject;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPageMethods {

    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, java.time.Duration.ofSeconds(10));


    public static void switchToCheckBoxIframe(WebDriver driver){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CheckBoxPageObject.I_FRAME_CHECKBOX_LOCATOR));
        WebElement iframeElement = driver.findElement(CheckBoxPageObject.I_FRAME_CHECKBOX_LOCATOR);
        wait.until(ExpectedConditions.presenceOfElementLocated(CheckBoxPageObject.I_FRAME_CHECKBOX_LOCATOR));
        driver.switchTo().frame(iframeElement);
    }

    public static void clickOnBasicCheckbox(WebDriver driver){
        wait.until(ExpectedConditions.elementToBeClickable(CheckBoxPageObject.BASIC_CHECKBOX));
        WebElement basicCheckbox = driver.findElement(CheckBoxPageObject.BASIC_CHECKBOX);
        basicCheckbox.click();
    }

//    public static void clearPreSelectedCheckbox(WebDriver driver){
//        wait.until(ExpectedConditions.elementToBeClickable(CheckBoxPageObject.PRE_CHECKED_CHECKBOX));
//        driver.findElement(CheckBoxPageObject.PRE_CHECKED_CHECKBOX).clear();
//    }

    public static void clickOnPreSelectedCheckbox(WebDriver driver){
        driver.findElement(CheckBoxPageObject.PRE_CHECKED_CHECKBOX).click();
    }

    public static void getTextFromDisableCheCheckBox(WebDriver driver){
        String text= driver.findElement(CheckBoxPageObject.DISABLED_CHECKBOX).getText();
        System.out.println("The text from the disabled checkbox is: "+text);
    }

    public static void clickOnSubscribeNewsletterCheckbox(WebDriver driver){
        driver.findElement(CheckBoxPageObject.SUBSCRIBE_NEWSLETTER_CHECKBOX).click();
    }

    public static void clickOnCheckboxWithEvent(WebDriver driver){
        driver.findElement(CheckBoxPageObject.CHECKBOX_WITH_EVENT).click();
    }
}
