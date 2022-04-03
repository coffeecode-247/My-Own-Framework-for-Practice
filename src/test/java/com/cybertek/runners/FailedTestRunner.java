package com.cybertek.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
RERUN is a built-in plugin in Cucumber.
It allows us to run FAILED TESTS again.
If I'm running 100 tests, 10 of those are failing.
If I have this plug-in enabled, in the next run, I am able to run
ONLY failed tests.

HOW DOES IT WORK:

1. You need to run tests and something MUST FAIL.
2. You need to run FailedTestRunner after something has failed.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/rerun.txt",
		glue = "com/cybertek/step_definitions"
)
public class FailedTestRunner {
}
