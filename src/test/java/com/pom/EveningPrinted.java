package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningPrinted {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//iframe")
	private WebElement frame;
	
	
	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement quantity;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//a[@id='color_24']")
	private WebElement color;
	
	@FindBy(xpath = "//button[@class='exclusive']//span")
	private WebElement addtocart;
	
	public EveningPrinted(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}


}
