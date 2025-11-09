package alphabetaops.steps;

import alphabetaops.methods.LeftMenuMethods;
import alphabetaops.methods.SimpleButtonPageMethods;
import alphabetaops.objects.SimpleButtonPageObjects;
import org.testng.annotations.Test;

public class BasicSimpleButtonsAutomated extends SeleniumHooks{

    @Test(priority = 1)
    public void NavigatingToTheSimpleButtonsPage() {
        LeftMenuMethods.clickOnLeftMenu(driver, "Novice");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop Downs");
        LeftMenuMethods.clickOnSubMenu(driver, "Text Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Check-Boxes");
        LeftMenuMethods.clickOnSubMenu(driver, "Radio Buttons");
        LeftMenuMethods.clickOnSubMenu(driver, "Drop-Down");
        LeftMenuMethods.clickOnSubMenu(driver, "Buttons");
        LeftMenuMethods.clickOnLeftMenuSubMenuItems(driver, "Simple Buttons");
        SimpleButtonPageMethods.switchToSimpleButtonIframe(driver);
    }

    @Test(priority = 2)
    public void ClickOnTheSimpleButton(){
        SimpleButtonPageMethods.clickOnSimpleButton(driver);
    }

    @Test(priority = 6)
    public void ClickOnTheButtonUnderIframe(){
        SimpleButtonPageMethods.clickOnButtonUnderIFrame(driver);
    }

    @Test(priority = 3)
    public void ClickOnTheButtonUnderShadowRoot(){
        SimpleButtonPageMethods.clickOnButtonUnderShadowDom(driver);
    }

    @Test(priority = 4)
    public void ClickOnThePseudoButton(){
        SimpleButtonPageMethods.clickOnThePseudoButton(driver);
    }
    @Test(priority = 5)
    public void HoverOnTheSimpleButtonAndSwitchBack(){
        SimpleButtonPageMethods.hoverOverSimpleButton(driver);
    }
}