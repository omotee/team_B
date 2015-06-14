package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class TestOne {
	
	
	public WebDriver driver;
	private BasePage basePage;
	private SignInPage signInPage;
	private String username = "demo@seotoaster.com";
	private String password = "demo";
	
	
	public TestOne(){
		this.driver = new FirefoxDriver();
		this.basePage = new BasePage(driver);
		this.signInPage = new SignInPage(driver);
	}
	
	

	@Test
	public void testValidLogin(){
		basePage.setUpDriver();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		basePage.tearDownDriver();
		
	}

}
