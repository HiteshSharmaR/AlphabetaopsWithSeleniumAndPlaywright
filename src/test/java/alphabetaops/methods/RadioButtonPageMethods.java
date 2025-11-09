package alphabetaops.methods;

import alphabetaops.objects.CheckBoxPageObject;
import alphabetaops.objects.RadioButtonPageObjects;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RadioButtonPageMethods {
    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, Duration.ofSeconds(10));

    public static void switchToRadioButtonIframe(WebDriver driver) {
        WebElement iframeElement = driver.findElement(RadioButtonPageObjects.RADIO_BUTTON_PAGE_IFRAME);
        wait.until(ExpectedConditions.presenceOfElementLocated(RadioButtonPageObjects.RADIO_BUTTON_PAGE_IFRAME));
        driver.switchTo().frame(iframeElement);
    }

    public static void clickOnRadioButton(WebDriver driver, String radioButtonLabel) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RadioButtonPageObjects.BASIC_RADIO_BUTTON_LABELS));
        List<WebElement> basicRadioButtons = driver.findElements(RadioButtonPageObjects.BASIC_RADIO_BUTTON_LABELS);
        for (WebElement radio : basicRadioButtons) {
            // 3️⃣ Get label text using JavaScript since we’re avoiding XPath
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String labelText = (String) js.executeScript(
                    "return arguments[0].parentElement.textContent.trim();", radio);

            System.out.println("Found: " + labelText);

            // 4️⃣ Match and click dynamically
            if (labelText.equalsIgnoreCase(radioButtonLabel)){
                radio.click();
                System.out.println("Clicked: " + labelText);
                break;
            }
        }
    }

    public static void clickOnPreSelectedRadioButton(WebDriver driver, String radioButtonLabel) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RadioButtonPageObjects.PRE_SELECTED_RADIO_BUTTON_LABELS));
        List<WebElement> preSelectedRadioButtons = driver.findElements(RadioButtonPageObjects.PRE_SELECTED_RADIO_BUTTON_LABELS);
        for (WebElement radio : preSelectedRadioButtons) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String labelText = (String) js.executeScript(
                    "return arguments[0].parentElement.textContent.trim();", radio);

            System.out.println("Found: " + labelText);

            if (labelText.equalsIgnoreCase(radioButtonLabel)){
                radio.click();
                System.out.println("Clicked: " + labelText);
                break;
            }
        }
    }

    public static void clickOnDisabledRadioButton(WebDriver driver, String radioButtonLabel) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RadioButtonPageObjects.DISABLED_RADIO_BUTTON_LABELS));
        List<WebElement> disabledRadioButtons = driver.findElements(RadioButtonPageObjects.DISABLED_RADIO_BUTTON_LABELS);
        for (WebElement radio : disabledRadioButtons) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String labelText = (String) js.executeScript(
                    "return arguments[0].parentElement.textContent.trim();", radio);

            System.out.println("Found: " + labelText);

            if (labelText.equalsIgnoreCase(radioButtonLabel)){
                radio.click();
                System.out.println("Clicked: " + labelText);
                break;
            }
        }
    }

    public static void clickOnColorDynamicRadioButton(WebDriver driver, String radioButtonLabel) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RadioButtonPageObjects.RADIO_WITH_DYNAMIC_COLOR_ON_SELECT));
        List<WebElement> colorDynamicRadioButtons = driver.findElements(RadioButtonPageObjects.RADIO_WITH_DYNAMIC_COLOR_ON_SELECT);
        for (WebElement radio : colorDynamicRadioButtons) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String labelText = (String) js.executeScript(
                    "return arguments[0].parentElement.textContent.trim();", radio);

            System.out.println("Found: " + labelText);

            if (labelText.equalsIgnoreCase(radioButtonLabel)){
                radio.click();
                System.out.println("Clicked: " + labelText);
                break;
            }
        }
    }

    public static void clickOnLabelHoverEffectRadioButton(WebDriver driver, String radioButtonLabel) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(RadioButtonPageObjects.LABEL_HOVER_EFFECT_RADIO_BUTTONS));
        List<WebElement> hoverEffectRadioButtons = driver.findElements(RadioButtonPageObjects.LABEL_HOVER_EFFECT_RADIO_BUTTONS);
        for (WebElement radio : hoverEffectRadioButtons) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String labelText = (String) js.executeScript(
                    "return arguments[0].parentElement.textContent.trim();", radio);

            System.out.println("Found: " + labelText);

            if (labelText.equalsIgnoreCase(radioButtonLabel)){
                radio.click();
                System.out.println("Clicked: " + labelText);
                break;
            }
        }
    }
}