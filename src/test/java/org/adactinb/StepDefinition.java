package org.adactinb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("user is on Adactin Login page")
	public void user_is_on_Adactin_Login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://adactinhotelapp.com/");
	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    String title = driver.getTitle();
	    System.out.println(title);
	}

	@When("user enter given valid  {string} and {string}")
	public void user_enter_given_valid_and(String string, String string2) {
	   WebElement txtUserName = driver.findElement(By.id("username"));
	   txtUserName.sendKeys(string);
	   WebElement txtPass = driver.findElement(By.id("password"));
	   txtPass.sendKeys(string2);
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    WebElement btnLogin = driver.findElement(By.name("login"));
	    btnLogin.click();
	}

	@Then("you are successfully login")
	public void you_are_successfully_login() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("user as Select {string}")
	public void user_as_Select(String string) {
		WebElement locat = driver.findElement(By.id("location"));
		locat.sendKeys(string);
	}

	@And("user to Select {string}")
	public void user_to_Select(String string) {
	   driver.findElement(By.id("hotels")).sendKeys(string);
	}

	@Then("user Select a {string}")
	public void user_Select_a(String string) {
	   driver.findElement(By.id("room_type")).sendKeys(string);
	}

	@And("user as {string}")
	public void user_as(String string) {
	    driver.findElement(By.id("room_nos")).sendKeys(string);
	}

	@Then("user as to Select {string}")
	public void user_as_to_Select(String string) {
	    driver.findElement(By.id("datepick_in")).sendKeys(string);
	}

	@Then("user as for Select {string}")
	public void user_as_for_Select(String string) {
	  driver.findElement(By.id("datepick_out")).sendKeys(string);
	}

	@Then("user to a Select {string}")
	public void user_to_a_Select(String string) {
	    driver.findElement(By.id("adult_room")).sendKeys(string);
	}


	@And("user for Select {string}")
	public void user_for_Select(String string) {
	   driver.findElement(By.id("child_room")).sendKeys(string);
	}

	@Then("user as click for Search button")
	public void user_as_click_for_Search_button() {
	   driver.findElement(By.id("Submit")).click();
	}

	@Then("user click the radio button and click the continue")
	public void user_click_the_radio_button_and_click_the_continue() {
	    driver.findElement(By.id("radiobutton_0")).click();
		   driver.findElement(By.id("continue")).click();

	}

	@And("user as give the {string}")
	public void user_as_give_the(String string) {
		 driver.findElement(By.id("first_name")).sendKeys(string);
	}

	@Then("user as give to the {string}")
	public void user_as_give_to_the(String string) {
		   driver.findElement(By.id("last_name")).sendKeys(string);

	}

	@And("user given the {string}")
	public void user_given_the(String string) {
	    driver.findElement(By.id("address")).sendKeys(string);

	}

	@Then("user as give a {string}")
	public void user_as_give_a(String string) {
	    driver.findElement(By.id("cc_num")).sendKeys(string);

	}

	@And("user as Select the {string}")
	public void user_as_Select_the(String string) {
		   driver.findElement(By.id("cc_type")).sendKeys(string);

	}

	@Then("user as Select to the {string} and {string}")
	public void user_as_Select_to_the_and(String string, String string2) {
		   driver.findElement(By.id("cc_exp_month")).sendKeys(string);
		    driver.findElement(By.id("cc_exp_year")).sendKeys(string2);
		
	}
	
	
	@And("user give a {string}")
	public void user_give_a(String string) {
	 	driver.findElement(By.id("cc_cvv")).sendKeys(string);

	}

	@Then("user Click the BookNow button")
	public void user_Click_the_BookNow_button() {
		driver.findElement(By.id("book_now")).click();
	}

	@Then("user Click the MyItinerary")
	public void user_Click_the_MyItinerary() {
	    driver.findElement(By.id("my_itinerary")).click();
	}

	@And("user get the OrderNo")
	public void user_get_the_OrderNo() {
	    WebElement orderNo = driver.findElement(By.id("order_no"));
	    System.out.println(orderNo.getAttribute("value"));
	}

	@And("user Click the Logout button")
	public void user_Click_the_Logout_button() {
	    driver.findElement(By.id("logout")).click();
	}

	@Then("user get the successfully logged out message")
	public void user_get_the_successfully_logged_out_message() {
	    WebElement logmsg = driver.findElement(By.id("logout"));
	    System.out.println(logmsg.getAttribute("value"));
	}



}
