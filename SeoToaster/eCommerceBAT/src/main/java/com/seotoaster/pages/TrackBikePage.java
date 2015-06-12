package com.seotoaster.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrackBikePage extends AbstractPage {

	public TrackBikePage(WebDriver driver) {
		super(driver);	
	}

	public void openVanNicholasBike() {
		try{
		driver.findElement(By.linkText("Track Bikes")).click();
		driver.findElement(By.linkText("Van Nicholas Astraeus DI2")).click();
		}catch(Throwable t){
			t.getMessage();
		}
	}
	

}
