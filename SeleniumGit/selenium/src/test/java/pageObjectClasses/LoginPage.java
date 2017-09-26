package pageObjectClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectRepo.LoginPageObjRepo;
import utilities.Utilities;;

public class LoginPage extends LoginPageObjRepo {
	WebDriver driver;
	WebDriverWait webDriverWait;
	utilities.Utilities util;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage Login(Map<String, String> map) {
		Utilities util = new Utilities(driver);
		
        
		util.fillInTextBoxInfo(username, map.get("username"));
		util.fillInTextBoxInfo(password, map.get("password"));
		util.click(submit);

		return new HomePage(driver);

	}
	
	
	
}
