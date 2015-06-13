package com.seotoaster.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RoadBikePage extends AbstractPage {
	
	

	public RoadBikePage(WebDriver driver) {
		super(driver);
		 }


	public void openWilierCentoBike() {
		try{
			driver.findElement(By.linkText("Road Bikes")).click();
			driver.findElement(By.partialLinkText("Wilier Cento 1 ")).click();
		}catch(Exception e){
			camera.takeShot("openWilierCentoBike");
		}
	}

	
}
