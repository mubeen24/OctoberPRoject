package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveOrder2 {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement checkbox;
	

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']//span")
	private WebElement checkout;


	public EveOrder2(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
}
