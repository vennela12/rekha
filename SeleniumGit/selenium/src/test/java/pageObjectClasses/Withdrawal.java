package pageObjectClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import objectRepo.WithdrawalObjRepo;

public class Withdrawal extends WithdrawalObjRepo{
	WebDriver driver;
	String id;

	public Withdrawal(WebDriver driver) {
		this.driver = driver;

	}

	public String clickOnDepositPage(String accId,Map<String, String> map) {

		driver.findElement(clickOnWithdrawalPage).click();

		driver.findElement(AccountNo).sendKeys(accId);
		driver.findElement(amount).sendKeys(map.get("amount2"));
		//driver.findElement(amount).sendKeys("20000");
		driver.findElement(description).sendKeys("Test");		
		driver.findElement(submit).click();
		//System.out.println(map.get("amount1")+"is added to your account with account number"+accId);
		return accId;



}
	
	public FundTransfer passingDriver(){
		return new FundTransfer(driver);
		
	}
}
