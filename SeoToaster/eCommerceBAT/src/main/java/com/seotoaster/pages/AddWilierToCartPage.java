package com.seotoaster.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AddWilierToCartPage extends AbstractPage {

	public AddWilierToCartPage(WebDriver driver) {
		super(driver);
		
	}

	public void verifyWilierTriestina105() {
			try{
			String message = "OPPS! There is no item in this Cart";
			Assert.assertTrue(message, driver.getPageSource().contains("$1,095.00"));
			}catch(Exception e){
				e.getMessage();
			}
			
			
			}
	
	
	}
