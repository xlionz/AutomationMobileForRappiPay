package co.com.mobile.screenplay.testrunners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.mobile.screenplay.glue",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@LogOutKyteApp"
)
public class RunnersMobile {
}
