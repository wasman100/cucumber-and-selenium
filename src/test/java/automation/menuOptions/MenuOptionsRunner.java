package automation.menuOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/automation/menuOptions/menuOptionsRequirement.feature", 
		glue= "src/test/java/automation/menuOptions/",
		plugin = {"pretty", "html:target/cucumber"})

public class MenuOptionsRunner {

}
