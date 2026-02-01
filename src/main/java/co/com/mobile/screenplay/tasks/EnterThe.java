package co.com.mobile.screenplay.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.mobile.screenplay.ui.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class EnterThe implements Task {

    public static EnterThe validCredentials(){
        return Tasks.instrumented(EnterThe.class);
    }

    @Step("{0} fills the info with email adddres and password.")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("lion989821@hotmail.com").into(INPUT_EMAIL),
                WaitUntil.the(BTN_NEXT, isClickable()).forNoMoreThan(1).seconds().then(Click.on(BTN_NEXT)),
                Enter.theValue("pedropascaltest").into(INPUT_PASS),
                WaitUntil.the(BTN_GET_IN, isClickable()).forNoMoreThan(1).seconds().then(Click.on(BTN_GET_IN))
        );
    }
}
