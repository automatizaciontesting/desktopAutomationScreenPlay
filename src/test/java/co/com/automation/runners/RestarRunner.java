package co.com.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/operaciones.feature",
        glue = "co.com.automation",
        tags = {"@ejecutarResta"},
        snippets = SnippetType.CAMELCASE
)
public class RestarRunner {

}
