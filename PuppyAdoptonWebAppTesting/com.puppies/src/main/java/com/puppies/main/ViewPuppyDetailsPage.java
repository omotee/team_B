package com.puppies.main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewPuppyDetailsPage extends AbstractPage {

	public ViewPuppyDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void verifyAdoptionFee() {
		String message = "Test was not successful";
		Assert.assertTrue(message,driver.getPageSource().contains("The fees to adopt me are $34.95"));	
	}
	
	public void adoptAPuppy(){
		WebElement adoptMe = driver.findElement(By.className("rounded_button"));
		adoptMe.click();
	}
	
	

}
