package com.testng;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	private String basePage = "http://free-ecommerce-solution.seotoaster.com/";
	protected static Logger logger = LogManager.getLogger("TayoLog4J");
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	

	public void setUpDatabase (){
		logger.info("Database started!!!");
	}

	public void setUpDriver() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Implicit wait of 10 secs started");
		driver.manage().window().maximize();
		logger.info("Browser has been maximized");
		driver.get(basePage);
		logger.info("The Web Address has been loaded successfully");
		
	}


	public void tearDownDriver() {
		driver.quit();
		logger.info("The browser has now closed successfully");
		driver = null;
		logger.info("****************************************");
	}

}
