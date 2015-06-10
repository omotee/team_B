package poppyAdoption.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		super(driver);
		}

	public void verifyPuppyHomePage(){
		String mesage = "The page you are looking for does not exist";
		Assert.assertTrue(mesage, driver.getPageSource().contains("Home of the"));
		}
	
	public void selectBrook(){
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[4]/form/div/input")).click();
	}
}