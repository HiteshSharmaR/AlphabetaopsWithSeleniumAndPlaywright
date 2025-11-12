package alphabetaops.methods;

import alphabetaops.objects.LeftMenuObjects;
import alphabetaops.objects.MainMenuObjects;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainMenuMethods {
    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, Duration.ofSeconds(10));

    public static void ClickOnCenterMenu(WebDriver driver, String centerMenuName){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(MainMenuObjects.MAIN_MENU));
        List<WebElement> leftMenus= driver.findElements(MainMenuObjects.MAIN_MENU);
        for(int a=0; a<leftMenus.size();a++){
            WebElement singleMenu = leftMenus.get(a);
            if(singleMenu.getText().equalsIgnoreCase(centerMenuName)){
                singleMenu.click();
            }
        }
    }

}
