package com.seotoaster.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrackBikePage extends AbstractPage {

	public TrackBikePage(WebDriver driver) {
		super(driver);
		
	}

	public void openTypesOfTrackBike() {
	String bikePath = "Track Bikes";
	String bikePath1 = "Wilier Triestina 105";
	driver.findElement(By.partialLinkText(bikePath)).click();	
	driver.findElement(By.partialLinkText(bikePath1)).click();	
	}

	
}
