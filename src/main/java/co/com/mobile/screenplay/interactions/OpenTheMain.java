package co.com.mobile.screenplay.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.mobile.screenplay.ui.LandingPage.BTN_MAIN_MENU;

public class OpenTheMain implements Interaction {

    public static OpenTheMain menu(){
        return Tasks.instrumented(OpenTheMain.class);
    }

    @Step("{0} open the main menu.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MAIN_MENU)
        );
    }
}
