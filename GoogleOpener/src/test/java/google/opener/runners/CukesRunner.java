package google.opener.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@Test",
		features= {"resources/google/opener/features/"},
		glue="google/opener/step_definitions/",
		dryRun=true 
)
public class CukesRunner extends AbstractTestNGCucumberTests {
	

}
