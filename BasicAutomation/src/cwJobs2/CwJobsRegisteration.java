package cwJobs2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CwJobsRegisteration {
	
	private  WebDriver driver;
	private  String firstname;
	private  String surname;
	private  String email;
	private  String password;
	
	public CwJobsRegisteration(){
		driver = new FirefoxDriver();
	}
	
	public void setDetails(String firstname, String surname,String email,String password){
		this.firstname = firstname;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}
	
//	public void setFirstname(String firstname){
//		this.firstname = firstname;
//	}
//	
//	public void setLastname(String surname){
//		this.surname = surname;
//	
//	}
//	
//	public void setEmail(String email){
//		this.email =email;
//	}
//	
//	public void setPassword(String password){
//		this.password = password;
//		
//	}
	
	public void setUp(){
		driver.manage().window().maximize();
		driver.navigate().to("https://www.cwjobs.co.uk");
		driver.findElement(By.xpath("//*[@id='navbar-user-personalisation']/ul/li[1]/a")).click();
		
	}
	
	public void RegisterUser() throws IOException{
		
		
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(surname);
		driver.findElement(By.id("email")).sendKeys(email);
//		driver.findElement(By.id("btnCVUpload")).click(); 
	    
		
//		 open the Upload window using selenium    
//		Thread.sleep("20000"); // wait for page load    
//		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + 
//		"C\\Users\\Aijay\\Desktop\\CV -cwjobs.doc");

		
		
//		driver.findElement(By.xpath("//*[@id='cvUploadOptions']/li[1]/label")).click();
		driver.findElement(By.xpath("//*[@id='frmMain']/div/div[3]/div/div/div[6]/div[1]/div[2]/div/label[1]")).click();
		driver.findElement(By.xpath("//*[@id='frmMain']/div/div[3]/div/div/div[6]/div[2]/div[2]/div/label[1]")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmpassword")).sendKeys(password);
		driver.findElement(By.id("cvdbOptIn")).clear();
		driver.findElement(By.id("register")).click();
		
		
		WebElement education = driver.findElement(By.id("ddlEducation"));
		Select click = new Select(education);
		click.selectByValue("University degree");
	}
	
	public void verifyRegistration(){
		if(driver.getPageSource().contains("We already have an active account for this email")){
		System.out.println("Test was successful");
	}else 
		System.out.println("Test was unsuccessful");
	}	
	
	
	public void tearDown(){
		driver.close();
		driver = null;
	}
	
	
	
	

}
