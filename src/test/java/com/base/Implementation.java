package com.base;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Implementation extends BaseUtility {
	
	@Test(dataProvider="Data")
	private void tc0(String usernameData, String PasswordData) {
	browserLaunch("https://adactinhotelapp.com/");
	AdactinHomePage adactinhomepage = new AdactinHomePage();
	WebElement username = adactinhomepage.getUsername();
	Assert.assertTrue(username.isDisplayed());
	System.out.println("username is displayed");
	
	WebElement password = adactinhomepage.getPassword();
	Assert.assertTrue(password.isDisplayed());
	System.out.println("password is displayed");
	
	WebElement login = adactinhomepage.getLogin();
	Assert.assertTrue(login.isDisplayed());

	username.sendKeys(usernameData);
	password.sendKeys(PasswordData);
	
	login.click();
	
	Assert.assertEquals(driver.getTitle().contains("Adactin"), true);
	}
	
	@DataProvider(name = "Data")
	
	private Object[][] dataProvider() throws IOException{
	
		return new Object[][] {
		{dataFromExcel(0,0),dataFromExcel(0,1)},
		
		{dataFromExcel(1,0),dataFromExcel(1,0)},
		
		{dataFromExcel(2,0),dataFromExcel(2,1)},
		
		{dataFromExcel(3,0),dataFromExcel(3,1)}
		
		};
	}
	
}