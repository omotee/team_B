package poppyAdoption;

import org.openqa.selenium.WebDriver;


public class AbstractPage {
	protected WebDriver driver;
	String Url = "http://puppies.herokuapp.com";
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setUp(){
		driver.manage().window().maximize();
		driver.get(Url);
	}
	
	
	public void tearDown(){
		driver.quit();
		driver = null;
	}
}
	