package objectRepo;


import org.openqa.selenium.By;

public class CreateNewAccountObjRepo {
	
	protected By clickOnNewAccountForm = By.xpath("//a[@href='addAccount.php']");
	protected By CustomerID = By.xpath("//input[@name='cusid']");
	protected By AccountType = By.xpath("//select[@name='selaccount']");
	protected By InitialDeposit = By.xpath("//input[@maxlength='8']"); 
	protected By submit = By.xpath("//input[@name='button2']");
	protected By accountId=By.xpath("//*[@id=\"account\"]/tbody/tr[4]/td[2]");

}
