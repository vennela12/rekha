package pageObjectClasses;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Parameters;
import objectRepo.*;

public class EditCustomer extends EditCustomerObjRepo {
	WebDriver driver;

	public EditCustomer(WebDriver driver) {
		this.driver=driver;
	}
	 HomePage hmpge=new HomePage(driver);
	
	public void clickOnEditCustomerLink(String id) {
		
		driver.findElement(editcustomerlink).click();
		driver.findElement(CustomerId).sendKeys(id);
		driver.findElement(submit).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 public CreateNewAccount PassingDriver() { 
		 return new CreateNewAccount(driver);
	 }
	
}
