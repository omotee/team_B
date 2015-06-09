package myPackage.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import poppyAdoption.AbstractPage;
import poppyAdoption.AdoptPage;
import poppyAdoption.PuppyHomePage;

public class TestPuppy {

	public WebDriver driver;
	private PuppyHomePage puppyHomePage;
	private AdoptPage adoptPage;
	private AbstractPage abstractPage;
	

public TestPuppy(){
	driver = new FirefoxDriver();
	puppyHomePage = new PuppyHomePage(driver);
	adoptPage = new AdoptPage(driver);
	abstractPage = new AbstractPage(driver);
	}

@Before
public void startTest(){
	abstractPage.setUp();
}



	@Test
	public void herokuEndToEndTest(){
		puppyHomePage.verifyPuppyHomePage();
		adoptPage.selectBrook();
		adoptPage.verifyBrookPriceBeforeAdditionalProducts();
		adoptPage.adoptBrookWithAdditionalProducts();
		adoptPage.verifyBrookPriceAfterAdditionalProducts();
		adoptPage.completeAdoption();
//		adoptPage.verifyAdoption();
	}

@After
public void endTest(){
	
}
}


