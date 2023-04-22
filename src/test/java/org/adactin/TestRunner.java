package org.adactin;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testrunner.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\AdactingFormFil.feature", glue="org.adactinb",
dryRun=false,
monochrome=true,
strict=true,
plugin="junit:C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target\\ + Outputjson2.json")

public class TestRunner {
	@AfterClass
	public static void reporting() {
		ReportingClass.generateReport("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target\\" +"report1.json");
	}

}
