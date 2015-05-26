package cwJobs2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CwJobsLogin {

	private WebDriver driver;
	private String email;
	private String password;
	
	public void setDetails(String password, String email){
		this.email =email;
		this.password = password;	
	}
	
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cwjobs.co.uk");
		driver.findElement(By.xpath("//*[@id='navbar-user-personalisation']/ul/li[2]/a")).click();
		
	}
	
	public void Login(){
		driver.findElement(By.id("txtEmail")).sendKeys(email);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("chkRememberMe")).click();
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void verifyLogin(){
		if(driver.getPageSource().contains("Aijay's account")){
		System.out.println("Test was successful");
	}else 
		System.out.println("Test was unsuccessful");
	}	
	
	public void tearDown(){
		driver.close();
		driver =null;
	}
	
}
