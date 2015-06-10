package sportsdirect;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{

	public HomePage(WebDriver driver) {
		super(driver);
		}
	public void verifyHomePage(){
		String message = "Sorry you have got the wrong site";
		Assert.assertTrue(message, driver.getPageSource().contains("Main"));
	}

}
