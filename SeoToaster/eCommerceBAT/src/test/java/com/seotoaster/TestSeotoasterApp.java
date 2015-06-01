package com.seotoaster;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.seotoaster.main.AbstractPage;
import com.seotoaster.main.HomePage;
import com.seotoaster.util.SignInPage;
import com.seotoaster.work.LandingPage;

public class TestSeotoasterApp {
	public WebDriver driver;
	private HomePage homePage;
	private SignInPage signInPage;
	private LandingPage landingPage;
	private AbstractPage abstractPage;
	private String username = "demo@seotoaster.com";
	private String password = "demo";
	
	
	public TestSeotoasterApp(){
		driver = new FirefoxDriver();
		homePage = new HomePage(driver);
		signInPage = new SignInPage(driver);
		landingPage = new LandingPage(driver);
		abstractPage = new AbstractPage(driver);
	}
	
	@Before
	public void startTest(){
		abstractPage.setUpDriver();
		System.out.println("This is before method");
	}
	
	@After
	public void stopTest(){
		abstractPage.tearDownDriver();
		System.out.println("This is after method");
	}
	
	@Test
	public void testLogin(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		System.out.println("This is the login test");
	}
	
	@Test
	public void testLogout(){
		System.out.println("Hello this is tghe sceond test for Logout");
	}
	
	
	

}
