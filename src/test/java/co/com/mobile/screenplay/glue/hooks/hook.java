package co.com.mobile.screenplay.glue.hooks;

import co.com.mobile.screenplay.tasks.EnterThe;
import co.com.mobile.screenplay.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.net.MalformedURLException;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class hook {

    @Before
    public void setUp() throws MalformedURLException {
        setTheStage(new OnlineCast());
    }

    @Given("{string} clicks on the login button")
    public void clicksOnTheLoginButton(String actorName) {
        theActorCalled(actorName).attemptsTo(
                Login.Kyte()
        );
    }

    @When("enters valid credentials")
    public void entersValidCredentials() {
        theActorInTheSpotlight().attemptsTo(
                EnterThe.validCredentials()
        );
    }

}
