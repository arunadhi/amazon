package TestSuit;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.OpenBrowser;




public class HomeSuit extends OpenBrowser{
	@Test
	public void date(){
		new LoginPage(driver)
		.clickSigninLink();
	}
	
}

 
