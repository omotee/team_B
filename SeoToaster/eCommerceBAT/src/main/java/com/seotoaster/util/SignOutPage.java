package com.seotoaster.util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seotoaster.main.AbstractPage;

public class SignOutPage extends AbstractPage {
	public SignOutPage (WebDriver driver){
		 super(driver);	
	}

	public void logOut() {
		driver.findElement(By.linkText("LOGOUT")).click();
	}

	public void verifySuccessfulLogOut() {
		String message = "I am not sure that you have logged out successfully";
		Assert.assertTrue(message, driver.getPageSource().contains("Home"));
	}
}
