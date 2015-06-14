package com.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public void visitSignInPage() {
		try{
			logger.info("The visitSignInPage method has started");
			driver.findElement(By.linkText("Sign in")).click();
			logger.info("The signInPage method has been succussfully executed");
		}catch(Exception e){
			logger.error("The visitSignPage method has encountered error as "+e);
		}
	}

	public void loginWith(String username, String password) {
		try{
			logger.info("The loginWith Method has started with test data as "+username +" and "+ password);
			driver.findElement(By.id("email")).sendKeys(username);
			logger.info("The driver has entered username successfully as "+username);
			driver.findElement(By.id("password")).sendKeys(password);
			logger.info("The driver has entered password successfully as "+ password);
			driver.findElement(By.id("submit")).click();
			logger.info("The loginWith method has executed successfully with the following test data: "+username+ " and "+password);			
		}catch(Exception e){
			logger.error("The loginWith method has encountered error with the folowing error : "+e);
		}
	}

}
