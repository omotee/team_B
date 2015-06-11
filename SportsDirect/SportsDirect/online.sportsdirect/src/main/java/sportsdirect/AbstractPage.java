package sportsdirect;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	protected WebDriver driver;
	 String url = "http://www.sportsdirect.com";
	
	public AbstractPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setUp(){
		driver.manage().window().maximize();
		driver.get(url);
		}
	

	
	public void tearDown(){
		driver.quit();
		driver = null;
	}
	
}
