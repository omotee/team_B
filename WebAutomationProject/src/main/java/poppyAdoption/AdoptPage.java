package poppyAdoption;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdoptPage extends AbstractPage{

	public AdoptPage(WebDriver driver) {
		super(driver);
	}
	
	public void selectBrook(){
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[4]/form/div/input")).click();
	}
		
	
	public void verifyBrookPriceBeforeAdditionalProducts(){
		String PriceForBrook = "$34.95";
		String message = "OOPS!! The value for Brook must be " + PriceForBrook; 
		Assert.assertTrue(message, driver.getPageSource().contains(PriceForBrook));
	}
	
	public void adoptBrookWithAdditionalProducts(){
			driver.findElement(By.xpath("//*[@id='content']/div[2]/div/form/div/input[1]")).click();
			WebElement collarAndLeash = driver.findElement(By.name("collar"));
			if(collarAndLeash.isSelected()){
				System.out.println("This option has already been selected");
			}else{
				collarAndLeash.click();
			}
			
		}
	
	
	public void verifyBrookPriceAfterAdditionalProducts(){
	String message = " OOPS!! The value for Brook must be $74.93, and this is not the case here";
	String PriceForBrook = "$74.93";
	Assert.assertTrue(message, driver.getPageSource().contains(PriceForBrook));
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
		driver.findElement(By.name("commit")).click();;
		
	}

//	public void verifyAdoption(){
//		driver.navigate().to(Url);
//		Assert.assertTrue(driver.getPageSource().contains("Thank you for adopting a puppy!"));
//	}
}
