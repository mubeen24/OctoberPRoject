package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStore {
	
	public WebDriver driver;
	
	@FindBy(className = "login")
	private WebElement login;

	public MyStore(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogin() {
		return login;
	}
	

}
