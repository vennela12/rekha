package pageObjectClasses;

import org.openqa.selenium.WebDriver;

import ObjectRepo.DltCustomerObjRepo;

public class DltCustomer extends DltCustomerObjRepo {

	WebDriver driver;
	HomePage hmpg;

	public DltCustomer(WebDriver driver) {
		this.driver = driver;

		// TODO Auto-generated constructor stub
	}

	public void clickOnDltCustomer(String id) {
		driver.findElement(dltcustomerlink).click();
		driver.findElement(CustomerId).sendKeys(id);
		driver.findElement(submit).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();

	}
}
