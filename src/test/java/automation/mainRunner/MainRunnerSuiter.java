package automation.mainRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import automation.menuOptions.MenuOptionsRunner;
import automation.popularSession.PopularSessionRunner;



@RunWith(Suite.class)
@Suite.SuiteClasses({
	MenuOptionsRunner.class,
	PopularSessionRunner.class
})

public class MainRunnerSuiter {

	
}
