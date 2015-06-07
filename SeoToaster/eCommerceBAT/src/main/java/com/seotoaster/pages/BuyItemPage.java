package com.seotoaster.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyItemPage extends AbstractPage {


	public BuyItemPage(WebDriver driver) {
		super(driver);
			}

	public void addItem() {
		driver.findElement(By.linkText("Road Bikes")).click();
		driver.findElement(By.linkText("Orange Carb-O Racing Road Bike 2013")).click();
		
	}
	
	public void verifyItemPrice(){
		String bikeAmount1 = "$2,005.00";
		String message = "The item price entered is not "+bikeAmount1;
		Assert.assertTrue(message, driver.getPageSource().contains(bikeAmount1));
	}
	
	public void addItemToCart(){
		driver.findElement(By.linkText("Add to cart")).click();
	}
	
	public void verifyItemInCart(){
		String message = "The item is not available in cart";
		Assert.assertTrue(message, driver.getPageSource().contains("Orange Carb-O Racing Road Bike 2013"));
	}
 
}
