package co.com.mobile.screenplay.ui;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class HomePage {
    public static final Target BTN_LOGIN = the("Button to Login.")
            .locatedBy("//android.widget.TextView[@text = 'Entrar']");
    public static final Target INPUT_EMAIL = the("Input to fill with email addres.")
            .located(AppiumBy.className("android.widget.EditText"));
    public static final Target BTN_NEXT = the("Input to next step in login.")
            .locatedBy("//android.widget.TextView[@text = 'Avanzar']");
    public static final Target INPUT_PASS = the("Input to fill with the password.")
            .located(AppiumBy.accessibilityId("password-pw"));
    public static final Target BTN_GET_IN = the("Button to get in the page.")
            .locatedBy("//android.widget.TextView[@text = 'Entrar']");
}
