package alphabetaops.objects;

import org.openqa.selenium.By;

public class RadioButtonPageObjects {

    public static final By RADIO_BUTTON_PAGE_IFRAME = By.cssSelector("iframe[title^='Radio Buttons — Basic Radio Buttons']");
    public static final By BASIC_RADIO_BUTTON_LABELS = By.cssSelector("input[name='basic']");
    public static final By PRE_SELECTED_RADIO_BUTTON_LABELS = By.cssSelector("input[name='preselect']");
    public static final By DISABLED_RADIO_BUTTON_LABELS = By.cssSelector("input[name='disabled']");
    public static final By RADIO_WITH_DYNAMIC_COLOR_ON_SELECT = By.cssSelector("input.color-radio");
    public static final By LABEL_HOVER_EFFECT_RADIO_BUTTONS = By.cssSelector("input[name='hover']");
}
