package alphabetaops.objects;

import org.openqa.selenium.By;

public class SignUpFormUnderDBTestingObjects {
    public static final By SIGN_UP_IFRAME = By.cssSelector("iframe[title^='Sign Up form — User Sign Up '");
    public static final By FIRST_NAME_INPUT = By.id("fullName");
    public static final By EMAIL_INPUT = By.id("email");
    public static final By ENTER_PASSWORD = By.id("password");
    public static final By GENERATE_OTP_BUTTON = By.id("generateOtpBtn");
    public static final By OTP_INPUT = By.cssSelector("input#otpField");
    public static final By OTP_SUBMIT_BUTTON = By.cssSelector("button#submitFormBtn");
}
