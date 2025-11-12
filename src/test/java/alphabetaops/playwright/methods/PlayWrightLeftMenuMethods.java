package alphabetaops.playwright.methods;

import alphabetaops.playwright.objects.PlayWrightLeftMenuPageObjects;
import alphabetaops.playwright.steps.Hooks;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PlayWrightLeftMenuMethods {

    private static final Page page = Hooks.page;
    public static void clickOnLeftMenu(String leftMenuName) {
        Locator leftMenu = page.locator(PlayWrightLeftMenuPageObjects.LEFT_MENU_DROPDOWN)
                .filter(new Locator.FilterOptions().setHasText(leftMenuName));
        leftMenu.first().waitFor();
        leftMenu.first().click();
        System.out.println("✅ Clicked on Left Menu: " + leftMenuName);
    }

    public static void clickOnSubMenu(String subMenuName) {
        Locator subMenu = page.locator(PlayWrightLeftMenuPageObjects.LEFT_SUBMENU_DROPDOWN)
                .filter(new Locator.FilterOptions().setHasText(subMenuName));
        subMenu.first().waitFor();
        subMenu.first().scrollIntoViewIfNeeded();
        subMenu.first().click();
        System.out.println("✅ Clicked on Submenu: " + subMenuName);
    }

    public static void clickOnLeftMenuSubMenuItems(String menuItemName) {
        Locator menuItem = page.locator(PlayWrightLeftMenuPageObjects.LEFT_SUBMENU_ITEMS)
                .filter(new Locator.FilterOptions().setHasText(menuItemName));
        menuItem.first().waitFor();
        menuItem.first().scrollIntoViewIfNeeded();
        menuItem.first().click();
        System.out.println("✅ Clicked on Submenu Item: " + menuItemName);
    }
}
