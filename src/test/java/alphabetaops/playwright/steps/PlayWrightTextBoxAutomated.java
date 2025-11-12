package alphabetaops.playwright.steps;

import alphabetaops.playwright.methods.PlayWrightLeftMenuMethods;
import alphabetaops.playwright.methods.PlayWrightTextBoxPageMethods;
import org.testng.annotations.Test;

public class PlayWrightTextBoxAutomated extends Hooks {

    @Test(priority = 1)
    public void navigatingToTheTextBoxPage() {
        PlayWrightLeftMenuMethods.clickOnLeftMenu( "Novice");
        PlayWrightLeftMenuMethods.clickOnSubMenu( "Text Boxes");
        PlayWrightLeftMenuMethods.clickOnLeftMenuSubMenuItems("Basic Text Boxes");
    }

    @Test(priority = 2)
    public void enterDataInTextWithPlaceholder() {
        PlayWrightTextBoxPageMethods.enterDataInTextWithPlaceHolder("PlayWright Automated Text Box Input");
        PlayWrightTextBoxPageMethods.enterDataInTextInPreFilledInput("PlayWright Pre Filled Input");
        PlayWrightTextBoxPageMethods.enterDataInTextInRequiredFiled("PlayWright Required Field Input");
        PlayWrightTextBoxPageMethods.enterDataInTextInResettableInput("PlayWright Resettable Input");
    }
}