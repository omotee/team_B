package poppyAdoption.pages;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdoptMePage extends AbstractPage{

	public AdoptMePage(WebDriver driver) {
		super(driver);
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
	
	

//	public void verifyAdoption(){
//		driver.navigate().to(Url);
//		Assert.assertTrue(driver.getPageSource().contains("Thank you for adopting a puppy!"));
//	}
}
