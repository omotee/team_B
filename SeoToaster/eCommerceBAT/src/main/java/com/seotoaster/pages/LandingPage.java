package com.seotoaster.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LandingPage extends AbstractPage{

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public void verifySuccessfulLogin() {
		try{
		String message = "I am not sure that you have logged in successfully";
		Assert.assertTrue(message, driver.getPageSource().contains("admin"));	
		}catch(Exception e){
			System.out.println("The visit verify successful login method failed with error "+e);
		}
	}
	
	

}
