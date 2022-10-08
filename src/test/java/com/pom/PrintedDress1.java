package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintedDress1 {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']//span")
	private WebElement checkout;

	public WebElement getcheckout() {
		return checkout;
	}

	public PrintedDress1(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
