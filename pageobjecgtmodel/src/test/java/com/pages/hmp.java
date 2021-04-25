package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.util.TestbaseClass;

public class hmp extends TestbaseClass{

	@FindBy(id = "react-burger-menu-btn")
	WebElement clickbar;
	
	
	@FindBy(id = "logout_sidebar_link")
	WebElement hitlogout;
	
	public hmp() {
		PageFactory.initElements(driver, hmp.class);
	}
	
	
	
	public void Logout() {
		hitlogout.click();
	}
	
	public String get_page_title() {
		return driver.getTitle();
	}
	public void navbarclick() {
		// TODO Auto-generated method stub
		clickbar.click();
	}
	 
}
