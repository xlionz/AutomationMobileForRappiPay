package co.com.mobile.screenplay.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.mobile.screenplay.ui.StoreAccountPage.BTN_CLOSE_SESSION;
import static co.com.mobile.screenplay.ui.StoreAccountPage.BTN_CONFIRM_LOG_OUT;

public class CloseThe implements Task {

    public static CloseThe session(){
        return Tasks.instrumented(CloseThe.class);
    }

    @Step("{0} log out")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CLOSE_SESSION),
                Click.on(BTN_CONFIRM_LOG_OUT)
        );
    }
}
