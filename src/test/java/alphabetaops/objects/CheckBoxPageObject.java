package alphabetaops.objects;

import org.openqa.selenium.By;

public class CheckBoxPageObject {

    public static final By I_FRAME_CHECKBOX_LOCATOR = By.cssSelector("iframe[title^='Check-Boxes — Basic Check-Boxes '");

    public static final By BASIC_CHECKBOX = By.cssSelector("input[name='basic']");
    public static final By PRE_CHECKED_CHECKBOX = By.cssSelector("input[name='prechecked']");
    public static final By DISABLED_CHECKBOX = By.cssSelector("input[name='disabled']");
    public static final By SUBSCRIBE_NEWSLETTER_CHECKBOX = By.cssSelector("input[name='subscribe']");
    public static final By CHECKBOX_WITH_EVENT = By.cssSelector("input[name='changeListener']");
}
