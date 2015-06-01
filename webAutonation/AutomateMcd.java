package webAutonation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomateMcd {
	private WebDriver driver;
	
	public void exploreSite(){
		
	  	driver = new FirefoxDriver();  // this is to launch firefox webpage
		driver.manage().window().maximize();     // This is to maximize windows
		driver.get("http://www.ourlounge.co.uk");  // This takes you to the site you have in the string o can also use "navigate.to"
		driver.findElement(By.xpath("//*[@id='portlet-wrapper-58']/div[2]/div/div/form/fieldset/div[1]/input")).sendKeys("talktoomotayo@yahoo.co.uk");
		driver.findElement(By.id("_58_password")).sendKeys("teeahubi7882");
		driver.findElement(By.xpath("//*[@id='portlet-wrapper-58']/div[2]/div/div/form/fieldset/div[4]/input")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("======================================================");
		if(driver.getCurrentUrl().contains("lounge") == true){                       //This is a kind of Unit test and we can use Assert 
			System.out.println("The test has passed since it has returned Lounge");  //This is a kind of Unit test and we can use 
		}else{
			System.out.println("The test failed");
		
//			Thread.sleep(5000); // its is used to  delay time a test used to run note u will need to import try catch or  exception
			
			driver.close();    // this is used to close a win single window after test while quit is used to close multiple window
					
		}

	}
	
	
	public void mySchedule(){
		driver.manage().window().maximize();
		
		
		
		
		
	
	}
	
}
