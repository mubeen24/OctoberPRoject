package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order2 {
	
	public WebDriver driver;

	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement checkBox;

	@FindBy(xpath = "//button[@name='processCarrier']//span")
	private WebElement checkOut;

	public WebElement getcheckBox() {

		return checkBox;
	}
	
	public WebElement getcheckOut() {
		return checkOut;
	}
	
	public Order2(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
