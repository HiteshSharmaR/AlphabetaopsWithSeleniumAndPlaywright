package alphabetaops.playwright.steps;

import alphabetaops.playwright.methods.PlayWrightLeftMenuMethods;
import org.testng.annotations.Test;

public class PlayWrightTextBoxAutomated extends Hooks {

    @Test(priority = 1)
    public void navigatingToTheTextBoxPage() {
        PlayWrightLeftMenuMethods.clickOnLeftMenu( "Novice");
        PlayWrightLeftMenuMethods.clickOnSubMenu( "SubmenuName");
        PlayWrightLeftMenuMethods.clickOnLeftMenuSubMenuItems("Submenu Item");
    }
}
