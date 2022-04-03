package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

	@Before(order = 2)
	public void setUpScenario() {
		System.out.println("------BEFORE annotation: Setting up browser.");
	}

	@Before(value = "@db", order = 1)
	public void setUpDatabaseConnection() {
		System.out.println("------BEFORE ANNOTATION: DB Connection CREATED.");
	}


	@After(order = 1)
    /*
    @param: the Scenario comes from the Cucumber class.
     */
	public void tearDownScenario(Scenario scenario) {
		//System.out.println("------AFTER annotation: Closing browser.");
		//System.out.println("scenario.getName() = " + scenario.getName());
		//System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
		//System.out.println("scenario.isFailed() = " + scenario.isFailed());


        /*
        #1. We need to take a screenshot using Selenium.
        getScreenShotAs: to be able to use this method,
        we have to cast our driver type to "TakesScreenshot".
        */

		if (scenario.isFailed()) { //only THEN, take screenshot.

			byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

			//#2. We are going to attach it into our report:

			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}


	@After(value = "@db", order = 4)
	public void tearDownDataBaseConnection() {
		System.out.println("-------AFTER ANNOTATION: DB Connection CLOSED.");
	}

	@BeforeStep
	public void setUpStep() {
		System.out.println("====BEFORESTEP: Taking Screenshot");
	}

	@AfterStep
	public void tearDownStep() {
		System.out.println("=====AFTERSTEP: Taking Screenshot");
	}
}
