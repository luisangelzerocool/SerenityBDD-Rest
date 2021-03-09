
package co.com.AdvantageDemo.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/createaccount.feature",
				  tags = "@RunnerTags",
				  glue = "co.com.AdvantageDemo.stepdefinitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}

