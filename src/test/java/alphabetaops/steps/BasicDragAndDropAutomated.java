package alphabetaops.steps;

import alphabetaops.methods.DragAndDropPageMethods;
import alphabetaops.methods.LeftMenuMethods;
import org.testng.annotations.Test;

public class BasicDragAndDropAutomated extends SeleniumHooks{

    @Test(priority = 1)
    public void navigateToDragAndDropPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop Downs");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Check-Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Radio Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop-Down");
        LeftMenuMethods.clickOnSubMenu(driver, "Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Date Pickers");
        LeftMenuMethods.clickOnSubMenu(driver, "File Upload");
        LeftMenuMethods.clickOnSubMenu(driver,"Drag Drop");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Simple Drop");
        DragAndDropPageMethods.switchToDragAndDropIframe(driver);
    }

    @Test(priority = 2)
    public void performDragAndDrop() {
        DragAndDropPageMethods.dragAndDropElement(driver);
    }
}
