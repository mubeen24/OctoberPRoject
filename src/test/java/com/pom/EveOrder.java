package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveOrder {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span")
	private WebElement checkout;

	public WebElement getcheckout() {
		return checkout;
	}

	public EveOrder(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
