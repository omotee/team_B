package myPackage.Main;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTest {

	private static WebDriver driver;
	public String currentUrl = "http://www.mcdonalds.co.uk/ukhome.html";

	
	
	
	public void loadPage() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(currentUrl);
		String message = "This is to show that my web address does not match";
		String pageTitle = "McDonald's UK :: McDonalds.co.uk";
		Assert.assertEquals(message, pageTitle, driver.getTitle());
		Assert.assertTrue(message, driver.getPageSource().contains("Privacy"));
	}
	
	

	public void finish() {
		driver.close();
	}
}
