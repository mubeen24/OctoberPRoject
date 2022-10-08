package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span")
	private WebElement checkOut;

	public WebElement getCheckOut() {
		return checkOut;
	}

	public Order(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
