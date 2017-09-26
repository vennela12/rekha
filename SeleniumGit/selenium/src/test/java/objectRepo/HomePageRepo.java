package objectRepo;

import org.openqa.selenium.By;

public class HomePageRepo {
	protected By createNewCustomerLink = By.xpath("//a[@href='addcustomerpage.php']");
	protected By customerName = By.xpath("//input[@name='name']");
	protected By gender = By.xpath("//input[@value='m']");
	protected By dob = By.xpath("//input[@id='dob']");
	protected By address = By.xpath("//textarea[@cols='20']");
	protected By city = By.xpath("//input[@name='city']");
	protected By state = By.xpath("//input[@name='state']");
	protected By pincode = By.xpath("//input[@maxlength='6']");
	protected By mobilenumber = By.xpath("//input[@maxlength='15']");
	protected By email = By.xpath("//input[@maxlength='30']");
	protected By password = By.xpath("//input[@name='password']");
	protected By submit = By.xpath("//input[@name='sub']");
	protected By CustomerID = By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]");
	

}


