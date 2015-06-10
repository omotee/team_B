package com.seotoaster.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage extends AbstractPage {
	
	public SignOutPage (WebDriver driver){
		 super(driver);	
	}

	public void logOut() {
		try{
		driver.findElement(By.linkText("LOGOUT")).click();
		}catch(Exception e){
			System.out.println("The visit Log out method failed with error "+e);
		}
	}

	public void verifySuccessfulLogOut() {
		try{
		String message = "I am not sure that you have logged out successfully";
		Assert.assertFalse(message, driver.getPageSource().contains("admin"));
		}catch(Exception e){
			System.out.println("The visit Log out method failed with error "+e);
		}
	}
}
