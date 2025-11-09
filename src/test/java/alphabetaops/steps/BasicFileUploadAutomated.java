package alphabetaops.steps;

import alphabetaops.methods.DatePickerPageMethods;
import alphabetaops.methods.FileUploadPageMethods;
import alphabetaops.methods.LeftMenuMethods;
import org.testng.annotations.Test;

public class BasicFileUploadAutomated extends SeleniumHooks{

    @Test(priority = 1)
    public void NavigateToFileUploadPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop Downs");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Check-Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Radio Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop-Down");
        LeftMenuMethods.clickOnSubMenu(driver, "Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Date Pickers");
        LeftMenuMethods.clickOnSubMenu(driver, "File Upload");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Simple file Upload");
        FileUploadPageMethods.switchToFileUploadIframe(driver);
    }

    @Test(priority = 2)
    public void UploadFile() {
        FileUploadPageMethods.uploadFile(driver, "src/test/resources/TestData/File.png");
    }
}
