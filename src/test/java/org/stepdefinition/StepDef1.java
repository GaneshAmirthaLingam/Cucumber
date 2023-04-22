package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base.BaseClass;
import com.base.PageObjectModelInsta;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef1 extends BaseClass{

	
	@Given("Validation the Instagram Home Page using Incorrect username and InCrt password")
	public void validation_the_Instagram_Home_Page_using_Incorrect_username_and_InCrt_password() {
		
		
		browserLaunch("https://www.instagram.com/accounts/login/");
		
		
		
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
		//WebElement li = driver.findElement(By.name("username"));
//	enterText(li, "abcdefg");
//	Thread.sleep(3000);
//	li.click();
//	JavascriptExecutor j = (JavascriptExecutor)driver;
			
//	Thread.sleep(3000);
//	Object e1 = j.executeScript("arguments[0].setAttribute('value','abcd')", li);
//	Object ss = j.executeScript("return arguments[0].getAttribute('value')", li);
//	System.out.println(ss);
		
		
	try {
			PageObjectModelInsta po = new PageObjectModelInsta();
		WebElement username = po.getUsername();
		WebElement password = po.getPassword();
		enterText(username, "1");
		int length = username.getAttribute("value").length();
		boolean statusUsername = false;
		if(length>=1);{
			statusUsername=true;
		}
		enterText(password, "123456432");
		int length2 = password.getAttribute("value").length();
		boolean statusPassword = false;
		if(length2>=6) {
			statusPassword=true;
		}
		Assert.assertTrue(statusUsername);
		Assert.assertTrue(statusPassword);
		System.out.println("Both the Username and password fields are validated");} 
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	}

	@And("user confirm Login button isEnable")
	public void user_confirm_Login_button_isEnable() {
		PageObjectModelInsta po = new PageObjectModelInsta();
		boolean enabled = po.getLogIn().isEnabled();
		Assert.assertEquals(true, enabled);
		System.out.println("Login button is enabled");
		po.getLogIn().click();
	}

	@Then("user validates the homepage")
	public void user_validates_the_homepage() {
	   driver.quit();
	}



}
