package co.com.mobile.screenplay.questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.mobile.screenplay.ui.HomePage.BTN_LOGIN;


public class SeeTheHome implements Question<Boolean> {

    public static SeeTheHome page(){
        return new SeeTheHome();
    }

    @Step("{0} should see the login button is displayed")
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(BTN_LOGIN).isDisplayed()
        );
        return true;
    }
}
