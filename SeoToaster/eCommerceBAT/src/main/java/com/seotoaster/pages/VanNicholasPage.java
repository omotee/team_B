package com.seotoaster.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VanNicholasPage extends AbstractPage{

	public VanNicholasPage(WebDriver driver) {
		super(driver);
		
	}

	public void addVanNicholasToCart() {
		try{
			driver.findElement(By.linkText("Add to cart")).click();
		}catch(Exception e){
			camera.takeShot("addVanNicholasToCart");
		}
		
	}
	

}
