package alphabetaops.methods;

import alphabetaops.objects.DragAndDropPageObjects;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragAndDropPageMethods {
    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, Duration.ofSeconds(10));

    public static void switchToDragAndDropIframe(WebDriver driver) {
        wait.until(ExpectedConditions.presenceOfElementLocated(DragAndDropPageObjects.DRAG_AND_DROP_IFRAME_LOCATOR));
        WebElement iframeElement = driver.findElement(DragAndDropPageObjects.DRAG_AND_DROP_IFRAME_LOCATOR);
        driver.switchTo().frame(iframeElement);
    }

    public static void dragAndDropElement(WebDriver driver) {
        wait.until(ExpectedConditions.elementToBeClickable(DragAndDropPageObjects.DRAGGABLE_ELEMENT_LOCATOR));
        WebElement draggableElement = driver.findElement(DragAndDropPageObjects.DRAGGABLE_ELEMENT_LOCATOR);
        WebElement droppableElement = driver.findElement(DragAndDropPageObjects.DROPPABLE_ELEMENT_LOCATOR);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggableElement, droppableElement).build().perform();
    }
}
