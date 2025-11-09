package alphabetaops.methods;

import alphabetaops.objects.LeftMenuObjects;
import alphabetaops.steps.SeleniumHooks;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LeftMenuMethods {
    public static WebDriverWait wait = new WebDriverWait(SeleniumHooks.driver, Duration.ofSeconds(1000));
    public static void clickOnLeftMenu(WebDriver driver, String leftMenuName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeftMenuObjects.LEFT_MENU_DROPDOWN));
        List<WebElement>leftMenus= driver.findElements(LeftMenuObjects.LEFT_MENU_DROPDOWN);
        for(int a=0; a<leftMenus.size();a++){
            WebElement singleMenu = leftMenus.get(a);
            if(singleMenu.getText().equalsIgnoreCase(leftMenuName)){
                singleMenu.click();
            }
        }
    }

    public static void clickOnSubMenu(WebDriver driver, String subMenuName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeftMenuObjects.LEFT_SUBMENU_DROPDOWN));
        List<WebElement>subMenus= driver.findElements(LeftMenuObjects.LEFT_SUBMENU_DROPDOWN);
        for(int b=0; b<subMenus.size();b++){
            WebElement singleSubMenu = subMenus.get(b);
            if(singleSubMenu.getText().equalsIgnoreCase(subMenuName)){
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(singleSubMenu));
                    singleSubMenu.click();
                } catch (ElementClickInterceptedException e) {
                    System.out.println("Could not click on the submenu: " + subMenuName);
                }
            }
        }
    }

    public static void clickOnLeftMenuSubMenuItems(WebDriver driver, String menuItemName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(LeftMenuObjects.LEFT_SUBMENU_ITEMS));
        List<WebElement>menuItems= driver.findElements(LeftMenuObjects.LEFT_SUBMENU_ITEMS);
        for(int c=0; c<menuItems.size();c++){
            WebElement singleMenuItem = menuItems.get(c);
            System.out.println(singleMenuItem.getText());
            if(singleMenuItem.getText().equalsIgnoreCase(menuItemName)){
                singleMenuItem.click();
            }
        }
    }
}