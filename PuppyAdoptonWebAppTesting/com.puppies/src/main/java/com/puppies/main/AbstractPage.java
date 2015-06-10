package com.puppies.main;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;
	private String baseUrl = "http://puppies.herokuapp.com/";

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUp(){
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);	
	}
	
	public void tearDown(){
		driver.quit();
		driver = null;
	}

}
