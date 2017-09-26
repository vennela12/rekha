package pageObjectClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import objectRepo.LogoutPageObjRepo;

public class LogoutPage extends LogoutPageObjRepo {

	WebDriver driver;

	 
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		
	}

	public  void clickOnLogoutPage() {
		
		driver.findElement(clickOnLogoutPage).click();
		driver.switchTo().alert().accept();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	}
	

	
	
	
	
}
