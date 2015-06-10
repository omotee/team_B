package poppyAdoption.pages;

import org.openqa.selenium.WebDriver;


public class AbstractPage {
	protected WebDriver driver;
	String baseUrl = "http://puppies.herokuapp.com";
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setUp(){
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	
	
	public void tearDown(){
		driver.quit();
		driver = null;
	}
}
	