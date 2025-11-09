package alphabetaops.objects;

import org.openqa.selenium.By;

public class TextBoxPageObject {

    public static final By I_FRAME_LOCATOR = By.cssSelector("iframe[title^='Text Boxes']");
    public static final By TEXT_WITH_PLACEHOLDER = By.id("plain-text");
    public static final By TEXT_PRE_FILLED_INPUT = By.id("prefilled-text");
    public static final By TEXT_REQUIRED_FIELD = By.id("required-field");
    public static final By RESETTABLE_BUTTON = By.cssSelector("div.input-container button");
    public static final By RESETTABLE_TEXT_BOX = By.id("resettable-text");
    public static final By LIMITED_LENGTH_TEXT_BOX = By.id("limited-text");
}
