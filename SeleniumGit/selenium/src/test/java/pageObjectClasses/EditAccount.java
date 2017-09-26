package pageObjectClasses;

import org.openqa.selenium.WebDriver;

import com.sun.jna.platform.win32.Advapi32Util.Account;

import objectRepo.EditAccountObjRepo;

public class EditAccount extends EditAccountObjRepo {
	WebDriver driver;
	HomePage hmpg;

	public EditAccount(WebDriver driver) {
		this.driver = driver;

		// TODO Auto-generated constructor stub
	}

	public void clickOnEditAccount(String accId) {
		driver.findElement(EditAccountLink).click();
		driver.findElement(CustomerID).sendKeys(accId);
		driver.findElement(submit).click();
		System.out.println("Account is edited");

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DepositPage PassingDriver() {
		// TODO Auto-generated method stub
		return new DepositPage(driver);
	}
}
