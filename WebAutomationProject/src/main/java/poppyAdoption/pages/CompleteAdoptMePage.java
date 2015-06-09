package poppyAdoption.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CompleteAdoptMePage extends AbstractPage{

	public CompleteAdoptMePage(WebDriver driver) {
		super(driver);
	}

	public void completeAdoption(){
		driver.findElement(By.xpath("//*[@id='content']/div[2]/form[1]/div/input")).click();
		driver.findElement(By.id("order_name")).sendKeys("Tayo Babalola");
		String address = "27 Lanridge Road\nAbbeywood, London\nSE2 9SJ";
		driver.findElement(By.id("order_address")).sendKeys(address);
		driver.findElement(By.id("order_email")).sendKeys("419@naija.com");
		WebElement payType = driver.findElement(By.id("order_pay_type"));
		Select selector = new Select(payType); 
		selector.selectByValue("Check");
		driver.findElement(By.name("commit")).submit();
		
	}
	
	

}
