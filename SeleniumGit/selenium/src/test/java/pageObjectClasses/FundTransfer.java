package pageObjectClasses;

import java.util.Map;


import org.openqa.selenium.WebDriver;

import objectRepo.FundTransferObjRepo;

public class FundTransfer extends FundTransferObjRepo {

	WebDriver driver;
	

	public FundTransfer(WebDriver driver) {
		this.driver = driver;
	}


	public void transferFund(String accID, Map<String, String> Map) {
		driver.findElement(clickOnFundTransfer).click();
		driver.findElement(payersAccountNo).sendKeys(accID);
		driver.findElement(payeesAccountNo).sendKeys(Map.get("payersaccno"));
		driver.findElement(amount).sendKeys(Map.get("amount"));
		driver.findElement(description).sendKeys(Map.get("description"));
		driver.findElement(submit).click();
		System.out.println("Fund tranfer is done");

	}
	
//	public DepositPage passingDriver() {
//		return new DepositPage(driver);
//		
//		
//	}
//	
	
	
	public LogoutPage passingDriver() {
		// TODO Auto-generated method stub
		return new LogoutPage(driver);
		
	}
	
	
	
	
	
	
	
	
}
