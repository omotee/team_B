package com.puppies.main;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeMindPage extends AbstractPage {

	public ChangeMindPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void adoptPuppyBrook(){
		driver.findElement(By.className("rounded_button")).click();
	}

	public void chnageYourMind() {
		driver.findElement(By.xpath("//*[@id='content']/div[2]/form[3]/div/input[2]")).click();	
	}
	
	public void areYouSure(){
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		System.out.println(alert.getClass());
		alert.accept(); 
//		driver.switchTo().alert().accept();
//		alert.accept();	
	}
	
	public void areYouVerySure(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void verifyChangedMind(){
		String message = "There is no such page";
		Assert.assertTrue(message,driver.getPageSource().contains("Your car is currently empty"));
	}

}
