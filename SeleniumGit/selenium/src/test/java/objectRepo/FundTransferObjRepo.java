package objectRepo;

import org.openqa.selenium.By;

public class FundTransferObjRepo {
	
	protected By clickOnFundTransfer = By.xpath("//a[@href='FundTransInput.php']");
	protected By payersAccountNo = By.xpath("//input[@name='payersaccount']");
	protected By payeesAccountNo = By.xpath("//input[@name='payeeaccount']");
	protected By amount = By.xpath("//input[@maxlength='8']");
	protected By description = By.xpath("//input[@maxlength='20']");
	protected By submit = By.xpath("//input[@name='AccSubmit']");
	

}
