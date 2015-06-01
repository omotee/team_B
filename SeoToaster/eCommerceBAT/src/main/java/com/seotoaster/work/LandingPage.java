package com.seotoaster.work;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.seotoaster.main.AbstractPage;

public class LandingPage extends AbstractPage{

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public void verifySuccessfulLogin() {
		String message = "I am not sure that you have logged in successfully";
		Assert.assertTrue(message, driver.getPageSource().contains("admin"));		
	}
	
	

}
