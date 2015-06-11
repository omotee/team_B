package com.puppies.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CompleteAdoptionPage extends AbstractPage{

	public CompleteAdoptionPage(WebDriver driver) {
		super(driver);
	}
	
	

	public void supplyDetails(String name, String address, String email){
		
		driver.findElement(By.id("order_name")).sendKeys(name);
		driver.findElement(By.id("order_address")).sendKeys(address);
		driver.findElement(By.id("order_email")).sendKeys(email);
		
		WebElement payType = driver.findElement(By.id("order_pay_type"));
		Select click = new Select(payType);
		click.selectByVisibleText("Check");
		
		
		
	}

}
