package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestbaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestbaseClass() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/hp/Documents/eclipse workspace/"
					+ "pageobjecgtmodel/src/test/java/com/config/config.properties");
		prop.load(fis);			
		}catch(IOException e) {
			e.getMessage();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browser = prop.getProperty("browser");
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
					}
					else if(browser.equals("Chrome")) {
						WebDriverManager.chromedriver().setup();			
						driver = new ChromeDriver();
					}
					else if(browser.equals("edge")) {
						WebDriverManager.edgedriver().setup();			
						driver = new EdgeDriver();
					}
		
					driver.manage().window().maximize();
					
				    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.get(prop.getProperty("url"));
					
	}
	
	
	
	
	
}
