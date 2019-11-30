package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DefineLocators {
	public WebDriver driver;
	
	public void browsers(String browser, String url){
		
		switch(browser){
		case "ie" : System.setProperty("webdriver.ie.driver", "E:\\Refresh_Selenium\\Amazon\\src\\main\\java\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "chrome" : System.setProperty("webdriver.ie.driver", "E:\\Refresh_Selenium\\Amazon\\src\\main\\java\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		break;
		}
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public void browserQuit(){
		driver.quit();
	}

	public void enterData(WebElement element, String data){
		element.clear();
		element.sendKeys(data);
		
	}
	public void clickElement(WebElement element){
		element.click();
	}
	
	public void getValue(WebElement element){
		element.getText();
	}
}
