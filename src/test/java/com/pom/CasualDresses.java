package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDresses {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='product_img_link']")
	private WebElement quickView;

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement viewClick;

	public CasualDresses(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getquickView() {
		return quickView;
	}

	public WebElement getviewClick() {
		return viewClick;
	}
}
