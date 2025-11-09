package alphabetaops.steps;

import alphabetaops.methods.LeftMenuMethods;
import alphabetaops.methods.TextBoxPageMethods;
import org.testng.annotations.Test;

public class BasicTextBoxAutomated extends SeleniumHooks {

    @Test(priority = 1)
    public void NavigatingToTheTextBoxPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Basic Text Boxes");
        TextBoxPageMethods.enterIntoIframe(driver);
    }

    @Test(priority = 2)
    public void EnteredDataInTheTextBoxWithPlaceHolder(){
        TextBoxPageMethods.enterDataIntoTextWithPlaceholder( driver, "Sample Text");
    }

    @Test(priority = 3)
    public void EnteredDataInThePreFilledInput(){
        TextBoxPageMethods.clearDataInThePreFilledInput(driver);
        TextBoxPageMethods.sendDataInThePreFilledInput( driver, "Test Data");
    }

    @Test(priority = 4)
    public void EnterDataInRequiredField(){
        TextBoxPageMethods.enterDataInRequiredField( driver, "Required Field Data");
    }

    @Test(priority = 5)
    public void EnterDataInRessettableInputAndReset(){
        TextBoxPageMethods.clickOnResettableInputButton(driver);
        TextBoxPageMethods.enterDataInResettableInput( driver, "Resettable Data");
    }

    @Test(priority = 6)
    public void EnterDataInTheLimitedInputField(){
        TextBoxPageMethods.enterDataInLimitedInputField( driver, "1234567890");
    }
}