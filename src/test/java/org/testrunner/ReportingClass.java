package org.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	public static void convertJSontoCustomizedJVM(String json) {
		//File Class - Customized JVM report
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target\\outputjson.json");
		
		//Configuration - User defined Fields
		
		Configuration con = new Configuration(f, "FBLogin");
		con.addClassifications("Sprint", "2.0");
		con.addClassifications("StoryNo", "Tc23");
		con.addClassifications("Tcno", "23");
		con.addClassifications("Browsername", "Chrome");
		con.addClassifications("OS", "Windows10Pro");
		con.addClassifications("version", "10");
		
		//Compile Multiple JSON files into a Single JVM report
		
		List<String> li = new ArrayList();
		li.add(json);
		
		//Configure the User defined field with pre defined JSON file
		ReportBuilder reportBuilder = new ReportBuilder(li, con);
		reportBuilder.generateReports();
	}

	public static void generateReport(String string) {
		ReportingClass.generateReport("C:\\Users\\ADMIN\\eclipse-workspace\\CucumberProject\\target" + "\\Samplejson.json");
	}

}
