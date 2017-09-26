package pageObjectClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import objectRepo.DepositPageObjRepo;

public class DepositPage extends DepositPageObjRepo {

	WebDriver driver;
	String id;

	public DepositPage(WebDriver driver) {
		this.driver = driver;

	}

	public String clickOnNewAccountForm(String accId,Map<String, String> map) {

		driver.findElement(clickOnDepositPage).click();

		driver.findElement(AccountNo).sendKeys(accId);
		driver.findElement(amount).sendKeys(map.get("amount1"));
		//driver.findElement(amount).sendKeys("20000");
		driver.findElement(description).sendKeys("Test");		
		driver.findElement(submit).click();
		System.out.println(map.get("amount1")+"is added to your account with account number"+accId);
		return accId;

	}	
	
	public Withdrawal passingDriver(){
		return new Withdrawal(driver);
	}
	
//	public FundTransfer passingDriver(){
//		return new FundTransfer(driver);
//		
//	}

}
