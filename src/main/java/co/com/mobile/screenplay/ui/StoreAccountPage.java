package co.com.mobile.screenplay.ui;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class StoreAccountPage {
    public static final Target BTN_CLOSE_SESSION = the("Button to log out.")
            .locatedBy("//android.widget.TextView[contains(@text,'Cerrar sesi')]");
    public static final Target BTN_CONFIRM_LOG_OUT = the("Button to confirm the log out.")
            .located(AppiumBy.id("android:id/button1"));
}
