package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Locators.DefineLocators;

public class OpenBrowser extends DefineLocators{
	
	@BeforeMethod
	public void browser() throws IOException{
		String path = "E:\\Refresh_Selenium\\Amazon\\src\\main\\java\\utils\\Data.properties";
		FileInputStream file = new FileInputStream(path);
		Properties data = new Properties();
		data.load(file);
		String url = data.getProperty("url");
		String browser= data.getProperty("browser");
		browsers(browser, url);
		
	}
	
	@AfterMethod
	public void browserClose(){
		browserQuit();
	}

}
