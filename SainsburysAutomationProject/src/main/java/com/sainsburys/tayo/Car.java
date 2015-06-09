package com.sainsburys.tayo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Car {
	
	public static WebDriver driver;
	private static String url = "http://www.sainsburys.co.uk";
	private static String currentUrl = "http://www.sainsburys.co.uk/sol/index.jsp";
	
	public Car(){
		driver = new FirefoxDriver();
	}
	
	
	
	public void setUp(){
		driver.get(url);
		driver.manage().window().maximize();
		Assert.assertEquals(currentUrl, driver.getCurrentUrl());
	}
	
	public void tearDown(){
		driver.close();
	}
	
	
}



