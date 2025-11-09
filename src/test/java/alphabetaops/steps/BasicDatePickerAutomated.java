package alphabetaops.steps;

import alphabetaops.methods.DatePickerPageMethods;
import alphabetaops.methods.LeftMenuMethods;
import org.testng.annotations.Test;

public class BasicDatePickerAutomated extends SeleniumHooks {

    @Test(priority = 1)
    public void NavigateToDatePickerPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop Downs");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Check-Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Radio Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop-Down");
        LeftMenuMethods.clickOnSubMenu(driver, "Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Date Pickers");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Simple Date Pickers");
        DatePickerPageMethods.switchToDateAndTimeIframe(driver);
    }

    @Test(priority = 2)
    public void SelectDateInDatePicker() {
        DatePickerPageMethods.htmlDatePickerMethod(driver, "09-11-2025 05:05 PM");
    }

    @Test(priority = 3)
    public void SelectDateInPreFilledDateAndTime() {
        DatePickerPageMethods.selectDateInPreFilledDateAndTime(driver, "09-11-2025 05:05 PM");
    }

    @Test(priority = 4)
    public void SelectDateInRequiredDateAndTime() {
        DatePickerPageMethods.selectDateInRequiredDateAndTIme(driver, "09-11-2025 05:05 PM");
    }

    @Test(priority = 5)
    public void SelectDateInMinMaxTime() {
        DatePickerPageMethods.selectDateInMinMaxTime(driver, "09-11-2025 05:05 PM");
    }
}
