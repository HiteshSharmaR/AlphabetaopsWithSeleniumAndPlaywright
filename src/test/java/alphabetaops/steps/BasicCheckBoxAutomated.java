package alphabetaops.steps;

import alphabetaops.methods.CheckBoxPageMethods;
import alphabetaops.methods.LeftMenuMethods;
import org.testng.annotations.Test;

public class BasicCheckBoxAutomated extends SeleniumHooks{
    @Test(priority = 1)
    public void NavigatingToTheCheckBoxPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Check-Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Basic Check-Boxes");
        CheckBoxPageMethods.switchToCheckBoxIframe(driver);
    }

    @Test(priority = 2)
    public void SelectSingleCheckBox(){
        CheckBoxPageMethods.clickOnBasicCheckbox(driver);
    }

    @Test(priority = 3)
    public void ClearAndSelectPreSelectedCheckBox(){
        CheckBoxPageMethods.clickOnPreSelectedCheckbox(driver);
        CheckBoxPageMethods.clickOnPreSelectedCheckbox(driver);
    }

    @Test(priority = 4)
    public void GetTextFromDisabledCheckBox(){
        CheckBoxPageMethods.getTextFromDisableCheCheckBox(driver);
    }

    @Test(priority = 5)
    public void SelectSubscribeNewsletterCheckBox(){
        CheckBoxPageMethods.clickOnSubscribeNewsletterCheckbox(driver);
    }

    @Test(priority = 6)
    public void SelectCheckBoxWithEvent(){
        CheckBoxPageMethods.clickOnCheckboxWithEvent(driver);
    }
}
