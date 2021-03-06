package com.seotoaster;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.seotoaster.pages.AbstractPage;
import com.seotoaster.pages.AddToCartPage;
import com.seotoaster.pages.AddWilierToCartPage;
import com.seotoaster.pages.MountainBikePage;
import com.seotoaster.pages.RoadBikePage;
import com.seotoaster.pages.HomePage;
import com.seotoaster.pages.LandingPage;
import com.seotoaster.pages.SantaCruzPage;
import com.seotoaster.pages.SignInPage;
import com.seotoaster.pages.SignOutPage;
import com.seotoaster.pages.TrackBikePage;
import com.seotoaster.pages.VanNicholasPage;
import com.seotoaster.pages.WilierCentoPage;
import com.seotoaster.pages.WilierTriestina105Page;


public class TestSeotoasterApp {
	public WebDriver driver;
	private HomePage homePage;
	private SignInPage signInPage;
	private LandingPage landingPage;
	private static AbstractPage abstractPage;
	private SignOutPage signOutPage;
	private RoadBikePage roadBikePage;
	private MountainBikePage mountainBikePage;
	private SantaCruzPage santaCruzPage;
	private AddToCartPage addToCartPage;
	private WilierCentoPage wilierCentoPage;
	private TrackBikePage trackBikePage;
	private WilierTriestina105Page wilierTriestina105Page;
	private AddWilierToCartPage addWilierToCartPage;
	private VanNicholasPage vanNicholasPage;
	private String username = "demo@seotoaster.com";
	private String password = "demo";  //demo
	
	
	public TestSeotoasterApp(){
		this.driver = new FirefoxDriver();
		this.homePage = new HomePage(driver);
		this.signInPage = new SignInPage(driver);
		this.landingPage = new LandingPage(driver);
		abstractPage = new AbstractPage(driver);
		this.signOutPage = new SignOutPage(driver);
		this.roadBikePage = new RoadBikePage(driver);
		this.mountainBikePage = new MountainBikePage(driver);
		this.santaCruzPage = new SantaCruzPage(driver);
		this.addToCartPage = new AddToCartPage(driver);
		this.wilierCentoPage = new WilierCentoPage(driver);
		this.trackBikePage = new TrackBikePage(driver);
		this.vanNicholasPage = new VanNicholasPage(driver);
	}
	
	
	@Before
	public void startTest(){
		abstractPage.setUpDriver();
	}
	
	@After
	public void stopTest(){
		abstractPage.tearDownDriver();
		
	}
	
	
	@Test
	public void testLogin(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
	}
	

//	@Ignore
//	@Test
//	public void testPurchaseBike(){
//		homePage.verifyHomePage();
//		signInPage.visitSignInPage();
//		signInPage.loginWith(username, password);
//		landingPage.verifySuccessfulLogin();

	@Ignore
	@Test
	public void testPurchaseBike(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
	}

//		roadBikePage.addBike();
//		roadBikePage.verifyBikePrice();
//		roadBikePage.addBikeToCart();
//		roadBikePage.verifyBikeInCart();
//	
//	}

	
//	@Ignore
	@Test
	public void testLogout(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		signOutPage.logOut();
		signOutPage.verifySuccessfulLogOut();	
	}
	
//	@Ignore
	@Test
	public void testAddAMountianBikeToCart() throws Throwable{
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		mountainBikePage.openSantaCruzBike();
		santaCruzPage.verifySantaCruzAmount();
		santaCruzPage.addASantazCruiseBikeToCart();
		addToCartPage.verifySantaCruzBike();
	}


//	@Ignore
	@Test
	public void testAddARoadBikeToCart(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		roadBikePage.openWilierCentoBike();
		wilierCentoPage.verifyWilierCentoAmount();
		wilierCentoPage.addWilierCentoToCart();
		addToCartPage.verifyWilierCentoBike();
	}
	
	@Ignore
	@Test
	public void testAddRoadBikeAndTrackBikeToCart() throws Throwable {
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		roadBikePage.openWilierCentoBike();
		wilierCentoPage.addWilierCentoToCart();
		trackBikePage.openVanNicholasBike();
		vanNicholasPage.addVanNicholasToCart();
		addToCartPage.verifyWilierAndVanBikesAmount();
	}
	
	
	@Test @Ignore
	public void testAddTwoTrackBikesToCart() throws Throwable{
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		mountainBikePage.openSantaCruzBike();
		santaCruzPage.verifySantaCruzAmount();
		santaCruzPage.addASantazCruiseBikeToCart();
		addToCartPage.verifySantaCruzBike();
		trackBikePage.openVanNicholasBike();
		vanNicholasPage.addVanNicholasToCart();
		addToCartPage.verifyWilierAndVanBikesAmount();
	}
	
	@Test @Ignore
	public void testAddThreeBikesTogether() throws Throwable{
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		mountainBikePage.openSantaCruzBike(); //Adding mountain bike
		santaCruzPage.verifySantaCruzAmount();
		santaCruzPage.addASantazCruiseBikeToCart();
		addToCartPage.verifySantaCruzBike();
		trackBikePage.openVanNicholasBike(); // Adding Track bike
		vanNicholasPage.addVanNicholasToCart();
		addToCartPage.verifyWilierAndVanBikesAmount();
		roadBikePage.openWilierCentoBike(); //Adding road bike
		wilierCentoPage.addWilierCentoToCart();
		addToCartPage.verifyWilierAndVanBikesAmount();
	}
	
	@Test @Ignore
	public void testAddTwoMountainBikesToCart() throws Throwable{
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		mountainBikePage.openSantaCruzBike(); //Adding mountain bike
		santaCruzPage.verifySantaCruzAmount();
		santaCruzPage.addASantazCruiseBikeToCart();
		addToCartPage.verifySantaCruzBike();
		mountainBikePage.openSantaCruzBike(); //Adding mountain bike
		santaCruzPage.verifySantaCruzAmount();
		santaCruzPage.addASantazCruiseBikeToCart();
		addToCartPage.verifySantaCruzBike();
	}
	
	
	@Test @Ignore
	public void testAddTwoRoadBikesToCart(){
		homePage.verifyHomePage();
		signInPage.visitSignInPage();
		signInPage.loginWith(username, password);
		landingPage.verifySuccessfulLogin();
		roadBikePage.openWilierCentoBike(); //Adding road bike
		wilierCentoPage.addWilierCentoToCart();
		roadBikePage.openWilierCentoBike(); //Adding road bike
		wilierCentoPage.addWilierCentoToCart();
	}
	

}
