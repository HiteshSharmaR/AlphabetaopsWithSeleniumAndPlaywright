package alphabetaops.playwright.methods;

import alphabetaops.playwright.objects.PlayWrightLeftMenuPageObjects;
import alphabetaops.playwright.steps.Hooks;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.PlaywrightException;

import java.util.List;

public class PlayWrightLeftMenuMethods extends Hooks{

    public static void clickOnLeftMenu( String leftMenuName) {
        List<ElementHandle> leftMenus = page.querySelectorAll(PlayWrightLeftMenuPageObjects.LEFT_MENU_DROPDOWN);
        for (ElementHandle singleMenu : leftMenus) {
            String menuText = singleMenu.innerText().trim();
            if (menuText.equalsIgnoreCase(leftMenuName)) {
                singleMenu.click();
                break;
            }
        }
    }

    public static void clickOnSubMenu( String subMenuName) {
        List<ElementHandle> subMenus = page.querySelectorAll(PlayWrightLeftMenuPageObjects.LEFT_SUBMENU_DROPDOWN);
        for (ElementHandle singleSubMenu : subMenus) {
            String subMenuText = singleSubMenu.innerText().trim();
            if (subMenuText.equalsIgnoreCase(subMenuName)) {
                try {
                    singleSubMenu.scrollIntoViewIfNeeded();
                    singleSubMenu.click(new ElementHandle.ClickOptions().setTimeout(5000));
                    break;
                } catch (PlaywrightException e) {
                    System.out.println("Could not click on submenu: " + subMenuName);
                }
            }
        }
    }

    public static void clickOnLeftMenuSubMenuItems(String menuItemName) {
        List<ElementHandle> menuItems = page.querySelectorAll(PlayWrightLeftMenuPageObjects.LEFT_SUBMENU_ITEMS);
        for (ElementHandle singleMenuItem : menuItems) {
            String text = singleMenuItem.innerText().trim();
            System.out.println(text);
            if (text.equalsIgnoreCase(menuItemName)) {
                singleMenuItem.scrollIntoViewIfNeeded();
                singleMenuItem.click();
                break;
            }
        }
    }
}
