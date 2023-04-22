package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstagramLoginPage {

	static WebDriver driver;
	public WebElement getUsername() {
		WebElement findElement = driver.findElement(By.id("name"));
		return findElement;
	}
	public WebElement getPassword() {
		WebElement findElement = driver.findElement(By.id("Password"));
		return findElement;
	}
	public WebElement getLogin() {
		WebElement findElement = driver.findElement(By.id("LogIn"));
		return findElement;
	}

	
}
