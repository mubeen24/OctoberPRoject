package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDress {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='product_img_link']")
	private WebElement quickview;
	
	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement viewclick;
	
	public WebElement getQuickview() {
		
		return quickview;
	}
	
	public WebElement getViewclick() {
		return viewclick;
	}
	
	public EveningDress(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
