package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	private String basePage = "http://free-ecommerce-solution.seotoaster.com/";
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	

	public void setUpDatabase (){
		System.out.println("This is for Database start up codes!!!");
	}

	public void setUpDriver() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(basePage);
		
	}


	public void tearDownDriver() {
		driver.quit();
		driver = null;
	}

}
