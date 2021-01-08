package co.com.latam.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/codigodereserva.feature",
				  tags = "@RunnerTags",
				  glue = "co.com.latam.test.stepdefinitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}
