package com.seotoaster;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.seotoaster.pages.AbstractPage;
import com.seotoaster.pages.BuyItemPage;
import com.seotoaster.pages.HomePage;
import com.seotoaster.pages.LandingPage;
import com.seotoaster.pages.SignInPage;
import com.seotoaster.pages.SignOutPage;

public class TestSeotoasterApp {
	public WebDriver driver;
	private HomePage homePage;
	private SignInPage signInPage;
	private LandingPage landingPage;
	private static AbstractPage abstractPage;
	private SignOutPage signOutPage;
	private BuyItemPage buyItemPage;
	
	private String username = "demo@seotoaster.com";
	private String password = "demo";
	
	
	public TestSeotoasterApp(){
		this.driver = new FirefoxDriver();
		this.homePage = new HomePage(driver);
		this.signInPage = new SignInPage(driver);
		this.landingPage = new LandingPage(driver);
		abstractPage = new AbstractPage(driver);
		this.signOutPage = new SignOutPage(driver);
		this.buyItemPage = new BuyItemPage(driver);
	}
	
	
	@Before
	public void startTest(){
		abstractPage.setUpDriver();
	}
	
	@After
	public void stopTest(){
		abstractPage.tearDownDriver();
		
	}
	
	@Ignore
	@Test
	public void testLogin(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
	}
	
	@Test
	public void testPurchaseBike(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		buyItemPage.addItem();
		buyItemPage.verifyItemPrice();
		buyItemPage.addItemToCart();
		buyItemPage.verifyItemInCart();
	
	}

	
	@Ignore
	@Test
	public void testLogout(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		signOutPage.logOut();
		signOutPage.verifySuccessfulLogOut();
		
	}
	
	

}
