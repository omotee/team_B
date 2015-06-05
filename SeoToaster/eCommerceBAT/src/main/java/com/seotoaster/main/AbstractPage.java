package com.seotoaster.main;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;
	private String baseUrl = "http://free-ecommerce-solution.seotoaster.com/";
	
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}


	public void setUpDriver() {
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}


	public void tearDownDriver() {
		driver.quit();
		driver = null;
	}
	
	
	

}
