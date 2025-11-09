package alphabetaops.steps;

import alphabetaops.methods.DropDownPageMethods;
import alphabetaops.methods.LeftMenuMethods;
import org.testng.annotations.Test;

public class BasicDropDownAutomated extends SeleniumHooks{

    @Test(priority = 1)
    public static void NavigatingToTheDropDownPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop Downs");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Check-Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Radio Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop-Down");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Basic Drop Down");
        DropDownPageMethods.switchToDropDownIframe(driver);
    }

    @Test(priority = 2)
    public static void SelectValueInSimpleSelectDropDown(){
        DropDownPageMethods.selectValueInSimpleSelectDropDown(driver, "HTML");
    }

    @Test(priority = 3)
    public static void SelectValueInDropDownWithDefaultValue(){
        DropDownPageMethods.selectValueInDropDownWithDefaultSelectedOption(driver, "Java");
    }

    @Test(priority = 4)
    public static void SelectValueInRequiredDropDown(){
        DropDownPageMethods.selectValueInRequiredDropDown(driver, "Java");
    }

    @Test(priority = 5)
    public static void SelectValueInGroupedDropDown(){
        DropDownPageMethods.selectValueInGroupedDropDown(driver, "HTML");
    }


    @Test(priority = 6)
    public static void SelectValueInResettableDropDown(){
        DropDownPageMethods.selectValueInResettableDropDown(driver, "Java");
    }
}
