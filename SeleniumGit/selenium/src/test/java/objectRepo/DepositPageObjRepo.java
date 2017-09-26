package objectRepo;

import org.openqa.selenium.By;

public class DepositPageObjRepo {
	protected By clickOnDepositPage = By.xpath("//a[@href='DepositInput.php']");
	protected By AccountNo = By.xpath("//input[@name='accountno']");
	protected By amount = By.xpath("//input[@maxlength='6']");
	protected By description = By.xpath("//input[@name='desc']");
	protected By submit = By.xpath("//input[@name='AccSubmit']");

}
