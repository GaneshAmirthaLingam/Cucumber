package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\ICICIPersonalLoan.feature",
glue="com.stepDefinition",
dryRun=false,
monochrome=true
		)

public class Testrunner {
	
}
