package com.helperfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {

	public static Properties p;

	public Test_Data_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Sep_AutomationPractice_Project\\src\\main\\java\\com\\singleton\\Test_Data.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String get_Browsers() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String get_URL() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String get_Email() {
		String email = p.getProperty("email");
		return email;
	}
	
	public String get_Password() {
		String password = p.getProperty("password");
		return password;
	}

}
