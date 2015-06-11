package com.puppies.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.puppies.main.AbstractPage;
import com.puppies.main.AdoptMePage;
import com.puppies.main.CompleteAdoptionPage;
import com.puppies.main.HomePage;
import com.puppies.main.PlaceOrderPage;
import com.puppies.main.ViewPuppyDetailsPage;

public class TestPuppyAdoptionApp {
	
	private WebDriver driver;
	private AbstractPage abstractPage;
	private HomePage homePage;
	private ViewPuppyDetailsPage viewPuppyDetailsPage;
	private AdoptMePage adoptMePage;
	private CompleteAdoptionPage completeAdoptionPage;
	private PlaceOrderPage placeOrderPage;
	private String name = "Edith";
	private String address ="12 SouthShields";
	private String email = "dine@yahoo.com";



    public TestPuppyAdoptionApp(){
	driver = new FirefoxDriver();
	abstractPage = new AbstractPage(driver);
	homePage = new HomePage(driver);
	viewPuppyDetailsPage = new ViewPuppyDetailsPage(driver);
	adoptMePage = new AdoptMePage(driver);
	completeAdoptionPage = new CompleteAdoptionPage(driver);
	placeOrderPage = new PlaceOrderPage(driver);
	
    
    }

   @Before
   public void preTest(){
	abstractPage.setUp();
	}

   	@Test
	public void runtest(){
	homePage.verifyHomePage();
	homePage.viewPuppy();
	viewPuppyDetailsPage.verifyAdoptionFee();
	adoptMePage.adoptBrook();
	adoptMePage.addProducts();
	completeAdoptionPage.supplyDetails(name, address, email);
	placeOrderPage.PlaceOrder();
	
	}

   	@After
    public void postTest(){
    	abstractPage.tearDown();
    }
}
