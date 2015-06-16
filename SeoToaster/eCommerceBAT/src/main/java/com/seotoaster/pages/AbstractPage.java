package com.seotoaster.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.seotoaster.util.Screenshot;

public class AbstractPage {
	protected WebDriver driver;
	private String baseUrl = "http://free-ecommerce-solution.seotoaster.com/";

	protected static Screenshot camera; 

	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
		camera = new Screenshot(driver);
	}

	
	
	
	public void setUpDatabase (){
		
		System.out.println("This is for Database start up codes!!!");
	}

	public void setUpDriver() {
		try{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseUrl);
		}catch(Exception e){
			camera.takeShot("setUpDriver");
		}
		
	}


	public void tearDownDriver() {
		try{
		driver.quit();
		driver = null;
		}catch (Exception e){
			camera.takeShot("tearDownDriver");
		}
	}
	
	
	

}
