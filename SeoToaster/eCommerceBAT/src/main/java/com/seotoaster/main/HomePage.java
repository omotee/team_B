package com.seotoaster.main;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void verifyHomePage() {
		String message = "I am not sure that you are on the home page";
		Assert.assertTrue(message, driver.getTitle().contains("Home"));
	}

}
