package pageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import ObjectRepo.EditCustomerObjRepo;

public class EditCustomer extends EditCustomerObjRepo{
	WebDriver driver;
	HomePage hmpg;
	
		
	public EditCustomer(WebDriver driver) {
		this.driver = driver;
		
		// TODO Auto-generated constructor stub
	}


	public void clickOnEditCustomer(String id) {
		driver.findElement(editcustomerlink).click();
		driver.findElement(CustomerId).sendKeys(id);
		driver.findElement(submit).click();
		

	}


	


}
