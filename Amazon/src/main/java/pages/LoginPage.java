package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.OpenBrowser;

public class LoginPage extends OpenBrowser{
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//span[contains(text(),'Hello. Sign in')]")
	private WebElement signinLink;
	public LoginPage clickSigninLink(){
		clickElement(signinLink);
		return this;
		
	}
}
