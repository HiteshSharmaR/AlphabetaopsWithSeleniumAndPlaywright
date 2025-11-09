package alphabetaops.methods;

import alphabetaops.objects.DatePickerPageObjects;
import alphabetaops.objects.FileUploadPageObject;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Paths;

public class FileUploadPageMethods {

    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, java.time.Duration.ofSeconds(10));

    public static void switchToFileUploadIframe(WebDriver driver) {
        wait.until(ExpectedConditions.presenceOfElementLocated(FileUploadPageObject.I_FRAME_FILE_UPLOAD_LOCATOR));
        WebElement iframeElement = driver.findElement(FileUploadPageObject.I_FRAME_FILE_UPLOAD_LOCATOR);
        driver.switchTo().frame(iframeElement);
    }

    public static void uploadFile(WebDriver driver, String filePath){
        wait.until(ExpectedConditions.elementToBeClickable(FileUploadPageObject.FILE_UPLOAD_INPUT_LOCATOR));
        WebElement fileUploadInput = driver.findElement(FileUploadPageObject.FILE_UPLOAD_INPUT_LOCATOR);
        File file = Paths.get(filePath).toFile();
        fileUploadInput.sendKeys(file.getAbsolutePath());
    }
}
