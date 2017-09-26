package pageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import objectRepo.CreateNewAccountObjRepo;
import utilities.Utilities;

public class CreateNewAccount extends CreateNewAccountObjRepo {
	WebDriver driver;
	String id;
	Utilities util = new Utilities(driver);

	public CreateNewAccount(WebDriver driver) {
		this.driver = driver;

	}

	public String clickOnNewAccountForm(String id) {
		Utilities util = new Utilities(driver);

		driver.findElement(clickOnNewAccountForm).click();

		driver.findElement(CustomerID).sendKeys(id);
		util.dropdown(AccountType, "Savings");
		
		// Select dropdown = new Select(driver.findElement(AccountType));
		// dropdown.selectByVisibleText("Savings");

		driver.findElement(InitialDeposit).sendKeys("10000");
		driver.findElement(submit).click();
		

		String accId = driver.findElement(accountId).getText();
		System.out.println(accId);
		return accId;

	}

	public EditAccount PassingDriver() {
		// TODO Auto-generated method stub
		return new EditAccount(driver);
	}

}


//try {
//	Thread.sleep(8000);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
