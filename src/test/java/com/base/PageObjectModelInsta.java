package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelInsta extends BaseClass{
public PageObjectModelInsta() { 
	PageFactory.initElements(driver,this);
}

	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//div[contains (text(), 'Log In')]")
	private WebElement LogIn;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogIn() {
		return LogIn;
	}
	public void setLogIn(WebElement logIn) {
		LogIn = logIn;
	}
	
}
