package objectRepo;

import org.openqa.selenium.By;

public class WithdrawalObjRepo {
	protected By clickOnWithdrawalPage = By.xpath("//a[@href='WithdrawalInput.php']");
	protected By AccountNo = By.xpath("//input[@name='accountno']");
	protected By amount = By.xpath("//input[@maxlength='8']");
	protected By description = By.xpath("//input[@name='desc']");
	protected By submit = By.xpath("//input[@name='AccSubmit']");


}
