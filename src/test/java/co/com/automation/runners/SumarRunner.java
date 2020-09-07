package co.com.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/sumar.feature",
        glue = "co.com.automation",
        snippets = SnippetType.CAMELCASE
)
public class SumarRunner {
}
