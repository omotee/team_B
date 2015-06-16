package com.seotoaster.pages;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends AbstractPage{

	public AddToCartPage(WebDriver driver) {
		super(driver);
	}

	public void verifySantaCruzBike()throws Throwable {
		try{
		String messageUponFailure = "Check that the page contains the a Santa Cruz bike";
		Assert.assertFalse(messageUponFailure, !driver.getPageSource().contains("Santa Cruz Tallboy LT Carbon"));
		}catch(Throwable t){
			camera.takeShot("verifySantaCruzBike");
			throw new Throwable("Check that you have actually added a Santa Cruz bike to the cart");
		}
		
	}

	public void verifyWilierCentoBike() {
		try{
		String message = "Sorry bike wasn't found";
		Assert.assertTrue(message, driver.getPageSource().contains("Wilier Cento 1 SR Sram Red Racing Road Bike 2013"));
		}catch(Throwable t){
			camera.takeShot("verifyWilierCentoBike");
			t.printStackTrace();
		}
	}

	public void verifyWilierAndVanBikesAmount() {
		try{
		String message = "Test was not successful";
		Assert.assertTrue(message, driver.getPageSource().contains("$7,245.00"));
		}catch(Throwable t){
			camera.takeShot("verifyWilierAndVanBikesAmount");
			t.getCause();
		}
	
		
	}

}
