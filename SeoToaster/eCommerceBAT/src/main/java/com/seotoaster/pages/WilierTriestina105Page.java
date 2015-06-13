package com.seotoaster.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WilierTriestina105Page extends AbstractPage {

	public WilierTriestina105Page(WebDriver driver) {
		super(driver);
		
	}

	public void verifyWilierTriestina105Availability() {
		try{
		String message = "The product you are looking for is either out of stock or you have entered the wrong details";
		Assert.assertTrue(message, driver.getPageSource().contains("In stock"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void addWilierTriestina105ToCart() {
		driver.findElement(By.partialLinkText("Add to cart")).click();
		
		
	}

}
