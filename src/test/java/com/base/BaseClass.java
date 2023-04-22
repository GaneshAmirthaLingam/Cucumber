package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.stepdefinition.InstagramLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{

	public static WebDriver driver;
	
	public void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	public void enterText( WebElement element, String text) {
		element.sendKeys(text);

	}
}
