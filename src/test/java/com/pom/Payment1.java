package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment1 {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement check;

	public WebElement getcheck() {
		return check;
	}

	public Payment1(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
}
