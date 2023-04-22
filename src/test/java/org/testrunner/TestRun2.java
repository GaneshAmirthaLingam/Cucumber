package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\FBLogin.feature", 
glue = "com.stepdef",
dryRun=false,
monochrome=true,
strict=true,
//snippets=Snippet Type.CAMELCASE,
//plugin="html:C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target")
//plugin="junit:C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target\\output.xml"
plugin="json:C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target\\outputjson.json")
public class TestRun2 {
	
@AfterClass
public static void reporting0() {
	
	ReportingClass.generateReport("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target" + "\\Samplejson.json");
	ReportingClass.convertJSontoCustomizedJVM("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target" + "\\Samplejson.json");
}
}
