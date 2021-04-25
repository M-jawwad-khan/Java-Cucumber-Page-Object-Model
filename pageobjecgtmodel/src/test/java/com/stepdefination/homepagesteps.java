package com.stepdefination;


import org.testng.Assert;

import com.pages.LoginPage;
import com.pages.hmp;
import com.util.TestbaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class homepagesteps extends TestbaseClass{

	LoginPage login;
	hmp hp;
	
	@Given("Open browser goto the login")
	public void open_browser_goto_the_login() {
		TestbaseClass.initialization();
	}

	@Then("Enter the username and password and hits the")
	public void enter_the_username_and_password_and_hits_the() {
		login = new LoginPage();
		 login.enter_username_and_password(prop.getProperty("username"), prop.getProperty("password"));
		
		 
	}

	@Then("user was navigated to the Next")
	public void user_was_navigated_to_the_Next() {
		hp = new hmp();
		String title = hp.get_page_title();
		 Assert.assertEquals("Swag Labs", title);
	}

	@And("User will be logout")
	public void user_will_be_logout() {
		hp = new hmp();
		hp.navbarclick();
		hp.Logout();
		driver.close();
	}
}
