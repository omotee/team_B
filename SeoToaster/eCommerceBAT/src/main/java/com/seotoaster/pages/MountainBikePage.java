package com.seotoaster.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MountainBikePage extends AbstractPage {

	public MountainBikePage(WebDriver driver) {
		super(driver);
	}

	public void openSantaCruzBike() {
		driver.findElement(By.partialLinkText("Mountain")).click();
		driver.findElement(By.partialLinkText("Santa Cruz Tallboy LT Carbon")).click();
		
	}
	
}
