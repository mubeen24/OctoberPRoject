package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrintedDress {
	public WebDriver driver;

	@FindBy(xpath = "//iframe")
	private WebElement frame;

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement plus;

	@FindBy(xpath = "//div[@class='selector']//following::select[@id='group_1']")
	private WebElement size;

	@FindBy(xpath = "//button[@type='submit']//following-sibling::span[text()='Add to cart']")
	private WebElement addtocart;
	
	public PrintedDress(WebDriver driver) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
