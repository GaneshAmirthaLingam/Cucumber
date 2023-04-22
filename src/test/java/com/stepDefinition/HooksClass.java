package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
	
		driver.close();
	}
}
