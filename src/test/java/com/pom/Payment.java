package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement pay;
	
	public WebElement getpay() {
		
		return pay;
	}
	
	public Payment(WebDriver driver) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}

}
