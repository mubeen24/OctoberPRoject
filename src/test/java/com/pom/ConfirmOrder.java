package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']//span")
	private WebElement confirmOrder;
	
	public WebElement getconfirmOrder() {
		
		return confirmOrder;
	}
	
	public ConfirmOrder(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
