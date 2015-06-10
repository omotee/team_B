package poppyAdoption.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ViewDetailsPage extends AbstractPage{

	public ViewDetailsPage(WebDriver driver) {
		super(driver);
	}

	public void verifyBrookPriceBeforeAdditionalProducts(){
		String PriceForBrook = "$34.95";
		String message = "OOPS!! The value for Brook must be " + PriceForBrook; 
		Assert.assertTrue(message, driver.getPageSource().contains(PriceForBrook));
	}
	
	

}
