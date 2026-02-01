package co.com.mobile.screenplay.questions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.mobile.screenplay.ui.LandingPage.LBL_SCREEN_TITLE;

public class SeeTheLanding implements Question<Boolean> {

    public static SeeTheLanding pageTitle(){
        return new SeeTheLanding();
    }

    @Step("{0} should see the title of Inicio in the page.")
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(LBL_SCREEN_TITLE).isDisplayed()
        );
        return true;
    }
}
