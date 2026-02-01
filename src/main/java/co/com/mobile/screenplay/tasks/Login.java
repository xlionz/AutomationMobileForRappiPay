package co.com.mobile.screenplay.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.mobile.screenplay.ui.HomePage.BTN_LOGIN;


public class Login implements Task {


    public static Login Kyte() {
        return Tasks.instrumented(Login.class);
    }

    @Step("{0} clicks login button.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN)
        );
    }
}
