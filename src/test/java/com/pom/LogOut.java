package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logOut;

	public WebElement getLogOut() {
		return logOut;
	}

	public LogOut(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
