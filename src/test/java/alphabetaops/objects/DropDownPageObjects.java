package alphabetaops.objects;

import org.openqa.selenium.By;

public class DropDownPageObjects {

    public static final By I_FRAME_DROPDOWN_LOCATOR = By.cssSelector("iframe[title^='Drop-Down — Basic Drop Down ']");
    public static final By SIMPLE_DROPDOWN_LOCATOR = By.id("simple-dropdown");
    public static final By DROPDOWN_WITH_DEFAULT_SELECTED_OPTION_LOCATOR = By.id("default-selected-dropdown");
    public static final By REQUIRED_DROPDOWN_LOCATOR = By.id("required-dropdown");
    public static final By GROUPED_DROPDOWN_LOCATOR = By.id("grouped-dropdown");
    public static final By RESETTABLE_DROPDOWN_LOCATOR = By.id("resettable-dropdown");
    public static final By RESET_BUTTON_LOCATOR = By.id("reset-btn");
}