package alphabetaops.steps;

import alphabetaops.methods.LeftMenuMethods;
import alphabetaops.methods.MainMenuMethods;
import alphabetaops.methods.SingUpFormUnderDBTestingMethods;
import org.testng.annotations.Test;

public class UserSignUpUnderDBTesting extends SeleniumHooks{

    @Test(priority = 1)
    public void NavigatingToTheUserSignUpUnderDBTesting(){
        MainMenuMethods.ClickOnCenterMenu(driver,"DB Testing");
        LeftMenuMethods.clickOnLeftMenu(driver,"Novice");
        LeftMenuMethods.clickOnSubMenu(driver,"Sign Up form");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver,"User Sign Up");
        SingUpFormUnderDBTestingMethods.switchToSignUpIframe(driver);
    }

    @Test(priority = 2)
    public void EnterDetailsInTheSignUpForm(){
        SingUpFormUnderDBTestingMethods.enterDetailsInFullName(driver,"Test User");
        SingUpFormUnderDBTestingMethods.enterDetailsInEmail(driver,"abc@gmail.com");
        SingUpFormUnderDBTestingMethods.enterDetailsInPassword(driver,"Test@1234");
        SingUpFormUnderDBTestingMethods.clickOnGenerateOTPButton(driver);
    }

    @Test(priority = 3)
    public void EnterOTPAndSubmitTheForm(){
        SingUpFormUnderDBTestingMethods.enterOtpInOTPInput(driver,"123456");
        SingUpFormUnderDBTestingMethods.clickOnOTPSubmitButton(driver);
    }
}
