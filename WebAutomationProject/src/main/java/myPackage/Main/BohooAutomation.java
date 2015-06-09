package myPackage.Main;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BohooAutomation {

	private WebDriver driver;
	 String baseUrl = "http://www.boohoo.com";
	
	
	public void homePage(){
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.navigate().to(baseUrl);
	}
	
		@SuppressWarnings("deprecation")
		public void searchFeature(){
		driver.findElement(By.id("q")).sendKeys("Jumper");
		driver.findElement(By.xpath("//*[@id='formsolrsearch']/button")).click();
		String message = "This test has failed";
		Assert.assertTrue(message, driver.getPageSource().contains("Hannah Cable Knit Crop Jumper"));
		}

		@SuppressWarnings("deprecation")
		public void verifyHomePage(){
			String confrimMessage = "We cant confirm a successful page visit";
			Assert.assertTrue(confrimMessage, driver.getTitle().contains("Register"));
		}
	
	}