package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.FacebookPojo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDef2 extends FacebookPojo{
	WebDriver driver;
	@Given("User able to launch the Facebook url")
	public void user_able_to_launch_the_Facebook_url() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
	   WebElement txtUsername = driver.findElement(By.id("email"));
	   txtUsername.sendKeys(string);
	   WebElement txtPassword = driver.findElement(By.id("pass"));
	   txtPassword.sendKeys(string);
	}

	@And("User clicks on the LoginButton")
	public void user_clicks_on_the_LoginButton() {
	   WebElement buttonLogin = driver.findElement(By.name("login"));
	   buttonLogin.click();
	}

	@Then("User validates the Error Message")
	public void user_validates_the_Error_Message() throws InterruptedException {
	    Thread.sleep(3000);
	    WebElement errorMessage = driver.findElement(By.xpath("//div[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']"));
	    Assert.assertTrue(errorMessage.getText().contains("incorrect"));
	    System.out.println("Error Message is verified");
	}

}
