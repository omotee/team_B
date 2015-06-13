package com.seotoaster.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WilierCentoPage extends AbstractPage {

	public WilierCentoPage(WebDriver driver) {
		super(driver);
		
	}

	public void verifyWilierCentoAmount() {
		try{
			String message = "There is no such price to said Bike";
			Assert.assertTrue(message,driver.getPageSource().contains("$4,575.00"));
		}catch(Exception e){
			camera.takeShot("verifyWilierCentoAmount");
		}
		
		
	}

	public void addWilierCentoToCart() {
		try{
			driver.findElement(By.linkText("Add to cart")).click();
		}catch(Exception e){
			camera.takeShot("addWilierCentoToCart");
		}
		
		
		
	}

}
