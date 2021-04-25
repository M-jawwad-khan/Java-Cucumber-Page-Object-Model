package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.TestbaseClass;



public class LoginPage extends TestbaseClass{
	
	
	//Initializing the page Object factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id ="user-name")
	WebElement txt_username;
	
	@FindBy(id ="password")
	WebElement txt_password;
	
	
	@FindBy(id ="login-button")
	WebElement btn_login;
	
	
	public void enter_username_and_password(String username,String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
		
	}
	
	
	
	
	
	
}
