package alphabetaops.objects;

import org.openqa.selenium.By;

public class SimpleButtonPageObjects {

    public static final By I_FRAME_SIMPLE_BUTTON_LOCATOR = By.cssSelector("iframe[title^='Buttons — Simple Buttons ']");
    public static final By SIMPLE_BUTTON_LOCATOR = By.id("simple-click");
    public static final By BUTTON_UNDER_IFRAME_LOCATOR = By.cssSelector("button[onclick='showSuccess()']");
    public static final By SHADOW_DOM_LOCATOR = By.cssSelector("#shadow-host");
    public static final By SHADOW_DOM_BUTTON_LOCATOR = By.cssSelector("#shadow-dom-btn");
    public static final By SHADOW_DOM_MESSAGE_LOCATOR = By.cssSelector("#msg-shadow-dom-btn");
    public static final By HOVER_BUTTON_LOCATOR = By.cssSelector("div.hover-area");
    public static final By PSEUDO_BUTTON_LOCATOR = By.cssSelector("#pseudo-btn");
}
