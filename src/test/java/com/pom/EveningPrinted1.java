package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningPrinted1 {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement checkout;
	
	public WebElement getCheckout() {
		return checkout;
	}

	public EveningPrinted1(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
}
