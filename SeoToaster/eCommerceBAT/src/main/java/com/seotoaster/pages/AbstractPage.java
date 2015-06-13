package com.seotoaster.pages;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver;
	private String baseUrl = "http://free-ecommerce-solution.seotoaster.com/";
	private static final double PI = 3.142;
	private static final String TAKE_ME_HOME = "Edwin";
	
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}

	public void setUpDatabase (){
		System.out.println("This is for Database start up codes!!!");
	}

	public void setUpDriver() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}


	public void tearDownDriver() {
		driver.quit();
		driver = null;
	}
	
	
	

}
