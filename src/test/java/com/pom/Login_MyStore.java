package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_MyStore {

	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;
	@FindBy(name = "passwd")
	private WebElement password;
	@FindBy(xpath = "//span//parent::button[@name='SubmitLogin']")
	private WebElement sigin;

	public Login_MyStore(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigin() {
		return sigin;
	}

}
