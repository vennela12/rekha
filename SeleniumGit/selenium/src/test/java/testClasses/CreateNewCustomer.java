package testClasses;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjectClasses.CreateNewAccount;
import pageObjectClasses.DepositPage;
import pageObjectClasses.EditAccount;
import pageObjectClasses.EditCustomer;
import pageObjectClasses.FundTransfer;
import pageObjectClasses.HomePage;
import pageObjectClasses.LoginPage;
import pageObjectClasses.LogoutPage;
import pageObjectClasses.Withdrawal;
import utilities.BaseClass;

public class CreateNewCustomer extends BaseClass {

	WebDriver driver;
	WebDriverWait webDriverWait;

	@Parameters({ "browser", "endRow", "startRow", "csvFile" })
	public CreateNewCustomer(String browser, int endRow, int startRow, String csvFile) {
		super(browser, endRow, startRow, csvFile);
		// TODO Auto-generated constructor stub
	}

	LoginPage loginpage;
	HomePage homepage;
	LogoutPage logoutpage;
	EditCustomer editcustomer;
	CreateNewAccount createNewAccount;
	EditAccount editAccount;
	DepositPage depositPage;
	Withdrawal withdrawal;
	FundTransfer fundTransfer;

	@Test(dataProvider = "csvData")
	public void createNewCustomerfromHomePage(Map<String, String> map) {
		loginpage = navigateToApplication();
		homepage = loginpage.Login(map);
		String cusid = homepage.NewCustomerDetails(map);
		editcustomer = homepage.PassingDriver();
		editcustomer.clickOnEditCustomerLink(cusid);
		createNewAccount = editcustomer.PassingDriver();
		String accId = createNewAccount.clickOnNewAccountForm(cusid);
		editAccount = createNewAccount.PassingDriver();
		editAccount.clickOnEditAccount(accId);
		depositPage = editAccount.PassingDriver();
		depositPage.clickOnNewAccountForm(accId, map);
		withdrawal=depositPage.passingDriver();
		withdrawal.clickOnDepositPage(accId, map);
		
		fundTransfer=withdrawal.passingDriver();
		fundTransfer.transferFund(accId, map);

		logoutpage = fundTransfer.passingDriver();
		logoutpage.clickOnLogoutPage();
		
		

	}
}
