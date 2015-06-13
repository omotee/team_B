package com.seotoaster.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Screenshot {
	private File scrFile;
	private WebDriver driver;
	
	public Screenshot(WebDriver driver){
		this.driver = driver;
	}
    
    public void takeShot(String screenName){
	 scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
    	try {
    		FileUtils.copyFile(scrFile, new File("C:\\Users\\EDWIN\\Desktop\\eCommerceBAT\\src\\main\\resources\\screenshots\\" + screenName + ".png"));
    	}catch (IOException e1) {
    		e1.printStackTrace();
    	} 
    }

}
