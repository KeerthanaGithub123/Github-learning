package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	// 1. By Locators: OR 
	private By EmailID= By.id("userEmail1");
	private By Password=By.id("userPassword");
	private By LoginButton=By.xpath("//*[@id='login']");
	

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void enterEmail(String Email) {
		driver.findElement(EmailID).sendKeys(Email);
	}

	public void enterPassword(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(LoginButton).click();
	}


}
