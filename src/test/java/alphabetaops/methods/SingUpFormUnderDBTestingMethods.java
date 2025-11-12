package alphabetaops.methods;

import alphabetaops.objects.SignUpFormUnderDBTestingObjects;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingUpFormUnderDBTestingMethods {
    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, Duration.ofSeconds(10));

    public static void switchToSignUpIframe(WebDriver driver) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SignUpFormUnderDBTestingObjects.SIGN_UP_IFRAME));
        WebElement iframeElement = driver.findElement(SignUpFormUnderDBTestingObjects.SIGN_UP_IFRAME);
        driver.switchTo().frame(iframeElement);
    }

    public static void enterDetailsInFullName(WebDriver driver, String fullName){
        driver.findElement(SignUpFormUnderDBTestingObjects.FIRST_NAME_INPUT).sendKeys(fullName);
    }

    public static void enterDetailsInEmail(WebDriver driver, String email){
        driver.findElement(SignUpFormUnderDBTestingObjects.EMAIL_INPUT).sendKeys(email);
    }

    public static void enterDetailsInPassword(WebDriver driver, String password){
        driver.findElement(SignUpFormUnderDBTestingObjects.ENTER_PASSWORD).sendKeys(password);
    }

    public static void clickOnGenerateOTPButton(WebDriver driver){
        driver.findElement(SignUpFormUnderDBTestingObjects.GENERATE_OTP_BUTTON).click();
    }

    public static void enterOtpInOTPInput(WebDriver driver, String otp){
        driver.findElement(SignUpFormUnderDBTestingObjects.OTP_INPUT).sendKeys(otp);
    }

    public static void clickOnOTPSubmitButton(WebDriver driver){
        driver.findElement(SignUpFormUnderDBTestingObjects.OTP_SUBMIT_BUTTON).click();
    }
}
