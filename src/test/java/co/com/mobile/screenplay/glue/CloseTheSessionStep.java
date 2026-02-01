package co.com.mobile.screenplay.glue;

import co.com.mobile.screenplay.exceptions.ExceptionError;
import co.com.mobile.screenplay.questions.SeeTheHome;
import co.com.mobile.screenplay.tasks.AccessThe;
import co.com.mobile.screenplay.tasks.CloseThe;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CloseTheSessionStep {

    @When("accesses the management account")
    public void accessesTheManagementAccount() {
        theActorInTheSpotlight().attemptsTo(
                AccessThe.managementAccount()
        );
    }

    @When("closes the session")
    public void closeTheSession() {
        theActorInTheSpotlight().attemptsTo(
                CloseThe.session()
        );
    }

    @Then("should see the main page")
    public void shouldSeeTheMainPage() {
        theActorInTheSpotlight().should(seeThat(SeeTheHome.page()).orComplainWith(ExceptionError.class));
    }
}
