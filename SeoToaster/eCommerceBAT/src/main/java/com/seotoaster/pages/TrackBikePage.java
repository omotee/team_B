package com.seotoaster.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrackBikePage extends AbstractPage {

	public TrackBikePage(WebDriver driver) {
<<<<<<< HEAD
		super(driver);
		
	}

	public void openTypesOfTrackBike() {
	String bikePath = "Track Bikes";
	String bikePath1 = "Wilier Triestina 105";
	driver.findElement(By.partialLinkText(bikePath)).click();	
	driver.findElement(By.partialLinkText(bikePath1)).click();	
	}

	
=======
		super(driver);	
	}

	public void openVanNicholasBike() throws Throwable{
		try{
		driver.findElement(By.xpath("//*[@id='container']/nav/ul[1]/li[2]/a")).click();
		driver.findElement(By.linkText("Van Nicholas Astraeus DI2")).click();
		}catch(Throwable t){
			throw new Throwable ("Something is not quite right with the openVanNicholasBike Method");
		}
	}
	

>>>>>>> 79c1795a0c56b7e8f95806f05f5309243957640e
}
