package rubySurvey;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class rubySurvey {

	private WebDriver driver;
	private String affirmation;
	private String surveyDetails;
	private String evangelist;
	
	public void setDetails(String affirmation, String surveyDetails, String evangelist){
		this.affirmation = affirmation;
		this.surveyDetails = surveyDetails;
		this.evangelist = evangelist;
		
	}
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://nitrowriters.com/form/form.html");	
	}
	
	public void survey() throws IOException, AWTException{
		driver.findElement(By.id("my_text_field")).sendKeys(affirmation);
		driver.findElement(By.id("a_text_area")).sendKeys(surveyDetails);
		driver.findElement(By.id("familiar_rails_3")).click();
		driver.findElement(By.id("favorite_1")).sendKeys(evangelist);
		driver.findElement(By.id("element_14_1")).click();
//		driver.findElement(By.id("usage")).click();
		
		WebElement dropdown = driver.findElement(By.id("usage"));
		Select click = new Select(dropdown);
		click.selectByValue("1");
	
		
		WebElement cV = driver.findElement(By.id("give_me_a_file"));
		cV.sendKeys("C:\\Users\\EDWIN\\Desktop\\Automation Site.txt");

		
		
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("saveForm")).click();
		
		
	}
	 
	
	public void tearDown(){
		driver.close();
		driver = null;
	}
}
