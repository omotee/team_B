package sportsdirect;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrainersPage extends AbstractPage{

	public TrainersPage(WebDriver driver) {
		super(driver);
		}
	
	public void trainers(){
		driver.findElement(By.linkText("Mens")).click();
		driver.findElement(By.linkText("Clothing")).click();
		driver.findElement(By.linkText("/mens/mens-polo-shirts#dcp=1&dppp=24&OrderBy=recent")).click();
		String kName = "SelectedFilter";
		WebElement gender = driver.findElement(By.className(kName));
		if(gender.isSelected()){
		System.out.println("The Option has been selected");
		}else{
		gender.click();
		}
	}

}
