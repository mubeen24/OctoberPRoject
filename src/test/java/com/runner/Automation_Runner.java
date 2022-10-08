package com.runner;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.helperfiles.File_Reader_Manager;
import com.utilityfiles.Utility_File_BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\MultipleFeature",

		glue = "com.stepdef",

		monochrome = true,

		dryRun = false,

		publish = false,

		plugin = {"html:C:\\Users\\DELL\\eclipse-workspace\\Cucumber_Practice\\reports/report.html"}
	
		//tags = "@EveningDress and @CasualDress"
		)



public class Automation_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws IOException {

		driver = Utility_File_BaseClass.get_Browser("chrome");

		String url = File_Reader_Manager.get_InstanceFileReaderManager().get_Instacne_Reader().get_URL();
		driver.get(url);
	}

	@AfterClass
	public static void tear_Down() throws IOException {


	}

}
