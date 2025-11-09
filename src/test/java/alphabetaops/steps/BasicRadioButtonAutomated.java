package alphabetaops.steps;

import alphabetaops.methods.LeftMenuMethods;
import alphabetaops.methods.RadioButtonPageMethods;
import org.testng.annotations.Test;

public class BasicRadioButtonAutomated extends SeleniumHooks{

    @Test(priority = 1)
    public void NavigatingToTheRadioButtonPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Check-Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Radio Buttons");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Basic Radio Buttons");
        RadioButtonPageMethods.switchToRadioButtonIframe(driver);
    }

    @Test(priority = 2)
    public void ClickOnBasicRadioButton(){
        RadioButtonPageMethods.clickOnRadioButton(driver, "Selenium");
    }

    @Test(priority = 3)
    public void ClickOnPreSelectedRadioButton(){
        RadioButtonPageMethods.clickOnPreSelectedRadioButton(driver, "Appium");
    }

    @Test(priority = 4)
    public void ClickOnRadioButtonWithDynamicColorOnSelect(){
        RadioButtonPageMethods.clickOnColorDynamicRadioButton(driver, "Playwright");
    }

    @Test(priority = 5)
    public void ClickOnLabelHoverEffect(){
        RadioButtonPageMethods.clickOnLabelHoverEffectRadioButton(driver, "Selenium");
    }

    @Test(priority = 6)
    public void ClickOnDisabledRadioButton(){
        RadioButtonPageMethods.clickOnDisabledRadioButton(driver, "Selenium");
    }
}
