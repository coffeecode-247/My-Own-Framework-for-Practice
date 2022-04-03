package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//We use RunWith(), to specify which tool we want to use for running the CukesRunner.
@RunWith(Cucumber.class)
@CucumberOptions(

        //for getting html report. In order to insert more plugin, wrap them with curly braces.
        plugin = {"html:target/cucumber-report.html",
				"json:target/cucumber.json",
				"rerun:target/rerun.txt"
		},
        //the name of the html can be dynamic, each name we use will automatically
        //create a new html report accordingly.

        features = "src/test/resources/features",
        //taking the root path of the feature package.

        glue = "com/cybertek/step_definitions",
        //this is where we actually implement our code in step_definitions.
        //As a sum, we take the features and implement it into the step_definitions, aka GLUE them.

        dryRun = false,
        //dryRun: it checks the feature files and scenario steps, against our step definitions.
        //It basically does not run our code when it is set to TRUE.

        tags = "@wiki" //this is a tag from the Login feature above a Scenario we want to Run.
)
public class CukesRunner {
}