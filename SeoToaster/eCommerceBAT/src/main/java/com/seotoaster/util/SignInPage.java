package com.seotoaster.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seotoaster.main.AbstractPage;

public class SignInPage extends AbstractPage{

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public void visitSignInPage() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	public void loginWith(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
	}

}
