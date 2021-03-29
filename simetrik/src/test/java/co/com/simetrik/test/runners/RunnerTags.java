package co.com.simetrik.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/consultagoogle.feature",
				  tags = "@RunnerTags",
				  glue = "co.com.simetrik.test.stepdefinitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}
