package co.com.mobile.screenplay.glue;

import co.com.mobile.screenplay.exceptions.ExceptionError;
import co.com.mobile.screenplay.questions.SeeTheLanding;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginKyteAppStep {

    @Then("should see the landingpage")
    public void shouldSeeTheLandingPage() {
        theActorInTheSpotlight().should(seeThat(SeeTheLanding.pageTitle()).orComplainWith(ExceptionError.class));
    }

}
