package objectRepo;

import org.openqa.selenium.By;

public class EditCustomerObjRepo {
	protected By editcustomerlink = By.xpath("//a[@href='EditCustomer.php']");
	protected By CustomerId = By.xpath("//input[@maxlength='10']");
	protected By submit = By.xpath("//input[@name='AccSubmit']");

}
