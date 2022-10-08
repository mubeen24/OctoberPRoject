package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order1 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit']//span)[2]")
	private WebElement checkOut;

	public WebElement getCheckOut() {
		return checkOut;
	}
	
	public Order1(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

}
