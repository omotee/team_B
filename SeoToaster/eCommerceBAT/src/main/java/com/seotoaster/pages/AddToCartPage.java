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

	@SuppressWarnings("unused")
	private void verifyMountainAndRoadBikeAddedToCart() throws InterruptedException {
			try{
			String message = "Sorry Item mismatch";
		Assert.assertTrue(message, driver.getPageSource().contains("$4,095.00"));
			}catch(Exception e){
				e.printStackTrace();
				Thread.sleep(9000);
			}
		
	}

}
