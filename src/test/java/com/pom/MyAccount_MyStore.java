package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_MyStore {
	public WebDriver driver;

	@FindBy(xpath = "(//a[.='Dresses'])[2]")
	private WebElement dresses;

	@FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
	private WebElement casualdress;

	@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
	private WebElement eveningDress;

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getEveningDress() {
		return eveningDress;
	}

	public MyAccount_MyStore(WebDriver driver) {
		
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
