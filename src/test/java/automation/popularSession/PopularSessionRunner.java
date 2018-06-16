package automation.popularSession;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/automation/popularSession/popularSessionRequirement.feature", 
		glue= "src/test/java/automation/popularSession/",
		plugin = {"pretty", "html:target/cucumber"})

public class PopularSessionRunner {

}
