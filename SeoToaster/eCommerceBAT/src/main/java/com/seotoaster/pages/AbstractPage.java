package com.seotoaster.pages;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;
	private String baseUrl = "http://free-ecommerce-solution.seotoaster.com/";
	
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}

	public void setUpDatabase(){
		System.out.println("This is for Database start up codes!!!");
	}

	public void setUpDriver() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}


	public void tearDownDriver() {
		driver.quit();
		driver = null;
	}
	
	
	

}
