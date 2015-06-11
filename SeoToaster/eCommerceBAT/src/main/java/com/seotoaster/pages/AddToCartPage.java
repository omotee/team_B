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
			throw new Throwable("Check that you have actually added a Santa Cruz bike to the cart");
		}
		
	}

}
