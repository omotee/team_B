package com.puppies.main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends AbstractPage {
	
	
	public HomePage(WebDriver driver){
		super(driver);
	}

	public void verifyHomePage() {
		String message = "HomePage is not available";
		Assert.assertTrue(message, driver.getPageSource().contains("Home of the Happy Puppy"));	
	}

	public void viewPuppy() {
		System.out.println("test in ");
		WebElement viewBrook = driver.findElement(By.className("rounded_button"));
		viewBrook.click();
		System.out.println("test out");
	}
	
	

}
