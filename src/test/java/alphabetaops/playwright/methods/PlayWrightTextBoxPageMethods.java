package alphabetaops.playwright.methods;

import alphabetaops.playwright.objects.PLayWrightTestBoxPageObjects;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;

import static alphabetaops.playwright.steps.Hooks.page;

public class PlayWrightTextBoxPageMethods {

    public static void enterDataInTextWithPlaceHolder(String data){
        FrameLocator iframeLocator = page.frameLocator(PLayWrightTestBoxPageObjects.I_FRAME_LOCATOR);
        Locator elementInsideIframe = iframeLocator.locator(PLayWrightTestBoxPageObjects.TEXT_WITH_PLACEHOLDER);
        elementInsideIframe.fill(data);
    }
    public static void enterDataInTextInPreFilledInput(String data){
        FrameLocator iframeLocator = page.frameLocator(PLayWrightTestBoxPageObjects.I_FRAME_LOCATOR);
        Locator elementInsideIframe = iframeLocator.locator(PLayWrightTestBoxPageObjects.TEXT_PRE_FILLED_INPUT);
        elementInsideIframe.fill(data);
    }
    public static void enterDataInTextInRequiredFiled(String data){
        FrameLocator iframeLocator = page.frameLocator(PLayWrightTestBoxPageObjects.I_FRAME_LOCATOR);
        Locator elementInsideIframe = iframeLocator.locator(PLayWrightTestBoxPageObjects.TEXT_REQUIRED_FIELD);
        elementInsideIframe.fill(data);
    }
    public static void enterDataInTextInResettableInput(String data){
        FrameLocator iframeLocator = page.frameLocator(PLayWrightTestBoxPageObjects.I_FRAME_LOCATOR);
        Locator elementInsideIframe = iframeLocator.locator(PLayWrightTestBoxPageObjects.RESETTABLE_TEXT_BOX);
        elementInsideIframe.fill(data);
    }
}
