package sportsdirect;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSportsDirect {

	public WebDriver driver;
	private HomePage homePage;
	private TrainersPage trainersPage;
	private AdidasSambaPage adidasSambaPage;
	private AbstractPage abstractPage;
	
	public TestSportsDirect(){
	  driver = new FirefoxDriver();
	  homePage = new HomePage(driver);
	  trainersPage = new TrainersPage(driver);
	  adidasSambaPage = new AdidasSambaPage(driver);
	  abstractPage = new AbstractPage(driver);
		 }
 
	@Before
	public void beginTest(){
		abstractPage.setUp();
	}
	
	@Test
	public void testSportsDirect(){
		 homePage.verifyHomePage();
		 trainersPage.trainers();

	
	}
}
