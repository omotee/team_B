package com.puppies.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdoptMePage extends AbstractPage {

	public AdoptMePage(WebDriver driver) {
		super(driver);
	}
	
	public void adoptBrook(){
		driver.findElement(By.className("rounded_button")).click();
	}

	public void addProducts() {
		driver.findElement(By.id("collar")).click();
		driver.findElement(By.id("carrier")).click();
		driver.findElement(By.className("rounded_button")).click();
		
	}

}
