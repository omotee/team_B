package poppyAdoption;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PuppyHomePage extends AbstractPage {

	public PuppyHomePage(WebDriver driver) {
		super(driver);
		}

	public void verifyPuppyHomePage(){
		String mesage = "The page you are looking for does not exist";
		Assert.assertTrue(mesage, driver.getPageSource().contains("Home of the Happy Puppy"));
		
	}
}