package com.puppies.main;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends AbstractPage{

	public PlaceOrderPage(WebDriver driver) {
		super(driver);
	}

	public void PlaceOrder() {
		
		driver.findElement(By.name("commit")).click();
	}
	
	public void verifyAdoption(){
		String message = "Test was not successful";
	Assert.assertTrue(message,driver.getPageSource().contains("Thank you for adopting a puppy!"));
	}

}
