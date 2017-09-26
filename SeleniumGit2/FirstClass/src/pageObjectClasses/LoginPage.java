package pageObjectClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepo.LoginPageObjRepo;

public class LoginPage extends LoginPageObjRepo {
	WebDriver driver;
	WebDriverWait webDriverWait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	

	public HomePage Login(Map<String, String> map) {
		System.out.println(map.get("username"));
		//Explicit
		webDriverWait = new WebDriverWait(driver,3,100);
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys(map.get("username"));
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(map.get("password"));
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
		//driver.findElement(submit).click();
				
		return new HomePage(driver);

	}
	/*try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
driver.findElement(username).sendKeys(map.get("username"));
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
driver.findElement(password).sendKeys(map.get("password"));
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
driver.findElement(submit).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}*/


}
