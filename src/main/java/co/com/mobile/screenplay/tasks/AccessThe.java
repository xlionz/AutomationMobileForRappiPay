package co.com.mobile.screenplay.tasks;

import co.com.mobile.screenplay.interactions.OpenTheMain;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.mobile.screenplay.ui.LandingPage.BTN_MAIN_ACC;

public class AccessThe implements Task {

    public static AccessThe managementAccount(){
        return Tasks.instrumented(AccessThe.class);
    }

    @Step("{0} accesses to management account.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                OpenTheMain.menu(),
                Click.on(BTN_MAIN_ACC)
        );
    }
}
