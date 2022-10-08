package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder1 {
	
	public WebDriver driver;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']//span")
	private WebElement checkout;

	public WebElement getcheckout() {
		return checkout;
	}

	public ConfirmOrder1(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
