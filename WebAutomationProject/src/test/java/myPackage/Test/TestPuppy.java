package myPackage.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import poppyAdoption.pages.AbstractPage;
import poppyAdoption.pages.AdoptMePage;
import poppyAdoption.pages.CompleteAdoptMePage;
import poppyAdoption.pages.HomePage;
import poppyAdoption.pages.ViewDetailsPage;

public class TestPuppy {

	public WebDriver driver;
	private HomePage homePage;
	private AdoptMePage adoptMePage;
	private AbstractPage abstractPage;
	private CompleteAdoptMePage completeAdoptPage;
	private ViewDetailsPage viewDetailsPage;

	public TestPuppy() {
		driver = new FirefoxDriver();
		homePage = new HomePage(driver);
		adoptMePage = new AdoptMePage(driver);
		abstractPage = new AbstractPage(driver);
		completeAdoptPage = new CompleteAdoptMePage(driver);
		viewDetailsPage = new ViewDetailsPage(driver);
	}

	@Before
	public void startTest() {
		abstractPage.setUp();
	}

	@Test
	public void herokuEndToEndTest() {
		homePage.verifyPuppyHomePage();
		homePage.selectBrook();
		viewDetailsPage.verifyBrookPriceBeforeAdditionalProducts();
		adoptMePage.adoptBrookWithAdditionalProducts();
		adoptMePage.verifyBrookPriceAfterAdditionalProducts();
		completeAdoptPage.completeAdoption();
		// adoptPage.verifyAdoption();
	}

	@After
	public void endTest() {
		abstractPage.tearDown();
	}
}
