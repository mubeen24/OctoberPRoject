package com.utilityfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_File_BaseClass {

	public static WebDriver driver;

	public static WebDriver get_Browser(String type) {
		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("edge")) {

		} else if (type.equalsIgnoreCase("firefox")) {

		}

		driver.manage().window().maximize();

		return driver;
	}

	public static int ImplicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

		return seconds;
	}

	public static WebElement ActionMovetoElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		return element;
	}

	public static WebElement iframe(WebElement element) {

		driver.switchTo().frame(element);
		return element;
	}

	public static void get(String url) {

		driver.get(url);
	}

	public static void click_On_Element(WebElement element) {

		element.click();

	}

	public static String send_Keys(WebElement element, String value) {

		element.sendKeys(value);

		return value;

	}
	

	public static void is_Enabled(WebElement element) {

		element.isEnabled();

	}

	public static void is_Selected(WebElement element) {
		element.isSelected();
	}

	public static void get_Title(WebDriver element) {

		element.getTitle();

	}

	public static void select_ByValue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void select_ByIndex(WebElement element, int number) {

		Select s1 = new Select(element);
		s1.selectByIndex(number);
	}

	public static void select_ByVisibleText(WebElement element, String value) {

		Select s2 = new Select(element);
		s2.selectByVisibleText(value);
	}

	public static String ScreenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		FileUtils.copyFile(srcFile, destFile);

		return path;
	}

	public static void clear(WebElement element) {

		element.click();
	}

	public static void get_TagName(WebElement element) {

		element.getTagName();
	}

	public static void is_Displayed(WebElement element) {

		element.isDisplayed();
	}

	public static String value;

	public static String ParticularCellData(String path, int rownum, int cellnum) throws IOException {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(0);

		Row row = sheet.getRow(rownum);

		Cell cell = row.getCell(cellnum);

		CellType type = cell.getCellType();

		if (type.equals(CellType.STRING)) {

			value = cell.getStringCellValue();

		} else if (type.equals(CellType.NUMERIC)) {

			double d = cell.getNumericCellValue();

			int a = (int) d;

			value = String.valueOf(a);

		}

		wb.close();
		
		return value;
	}

	
}
