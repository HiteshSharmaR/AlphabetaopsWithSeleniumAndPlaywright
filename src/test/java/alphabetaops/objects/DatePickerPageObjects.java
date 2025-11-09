package alphabetaops.objects;

import org.openqa.selenium.By;

public class DatePickerPageObjects {

    public static final By I_FRAME_DATE_PICKER_LOCATOR = By.cssSelector("iframe[title^='Date Pickers  — Simple Date Pickers']");
    public static final By HTML_DATE_TIME_PICKER_LOCATOR = By.id("dt1");
    public static final By PRE_SELECTED_DATE_PICKER_LOCATOR = By.id("dt2");
    public static final By REQUIRED_DATE_PICKER_LOCATOR = By.id("dt3");
    public static final By DATE_PICKER_WITH_MIN_MAX_LOCATOR = By.id("dt5");
}
