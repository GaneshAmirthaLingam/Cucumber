package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\FacebookLogin.feature", 
glue = "org.stepdefinition", dryRun=false)

public class TestRun {

}
