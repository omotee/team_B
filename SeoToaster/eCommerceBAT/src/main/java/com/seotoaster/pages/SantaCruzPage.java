package com.seotoaster.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SantaCruzPage extends AbstractPage{

	public SantaCruzPage(WebDriver driver) {
		super(driver);
	}

	public void verifySantaCruzAmount() throws Throwable {
		try{
		String messageUpOnFailure = "This page does not contain the desired amount";
		Assert.assertTrue(messageUpOnFailure, driver.getPageSource().contains("$3,000.00"));
		}catch(Exception e){
			throw new Exception("Please check that you are on the right page and there is appropriate amunt"+e);
		}
	}

	public void addASantazCruiseBikeToCart() throws Throwable {
		try{
			driver.findElement(By.partialLinkText("Add to cart")).click();
		}catch(Throwable t){
			throw new Throwable ("Please check your button as this is the error message: "+t);
		}
	}

}
