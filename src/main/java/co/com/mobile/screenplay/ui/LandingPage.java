package co.com.mobile.screenplay.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LandingPage {
    public static final Target LBL_SCREEN_TITLE = the("Label of the screen page.")
            .locatedBy("//android.widget.TextView[@text = 'Inicio']");
    public static final Target BTN_MAIN_MENU = the("Button to deploy the main menu.")
            .locatedBy("//android.widget.TextView[@text ='\uE5D2']");
    public static final Target BTN_MAIN_ACC = the("button to the go main access.")
            .located(AppiumBy.accessibilityId("my-acc-menu"));
}
