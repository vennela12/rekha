package pageObjectClasses;

import java.util.Map;
//import java.util.NoSuchElementException;

import org.apache.xalan.xsltc.compiler.util.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import objectRepo.HomePageRepo;
import utilities.Utilities;

public class HomePage extends HomePageRepo {
	WebDriver driver;
	String id;
	utilities.Utilities util;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String NewCustomerDetails(Map<String, String> map) {
		Utilities util = new Utilities(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 3, 100);
		util.click(createNewCustomerLink);
		util.fillInTextBoxInfo(customerName, map.get("customername"));		
		util.radiobutton(gender);
		util.fillInTextBoxInfo(dob, map.get("db"));
		util.fillInTextBoxInfo(address, map.get("address"));
		util.fillInTextBoxInfo(city, map.get("city"));
		util.fillInTextBoxInfo(state, map.get("state"));
		util.fillInTextBoxInfo(pincode, map.get("pincode"));
		util.fillInTextBoxInfo(mobilenumber, map.get("mobilenumber"));
		util.fillInTextBoxInfo(email, map.get("email"));
		util.fillInTextBoxInfo(password, map.get("password1"));
		
		
		
		/*wait.until(ExpectedConditions.presenceOfElementLocated(createNewCustomerLink)).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(customerName)).sendKeys(map.get("customername"));*/
		//driver.findElement(gender).click();
		// wait.until(ExpectedConditions.presenceOfElementLocated("dob")).sendKeys(map.get("dob"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(dob)).sendKeys(map.get("db"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(address)).sendKeys(map.get("address"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(city)).sendKeys(map.get("city"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(state)).sendKeys(map.get("state"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(pincode)).sendKeys(map.get("pincode"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(mobilenumber)).sendKeys(map.get("mobilenumber"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys(map.get("email"));
		//wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(map.get("password1"));
		driver.findElement(submit).click();

		id = driver.findElement(CustomerID).getText();
		System.out.println(id);
		return id;

	}
	
	 public EditCustomer PassingDriver() { 
		 return new EditCustomer(driver);
	 }

}

/*
 * public DltCustomer PassingDriver()
 *  return new DltCustomer(driver);
 */

/*
 * package pageObjectClasses;
 * 
 * import java.io.FileNotFoundException; import java.io.FileReader; import
 * java.util.Map; import java.util.NoSuchElementException; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.FluentWait; import
 * org.openqa.selenium.support.ui.Wait; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * import au.com.bytecode.opencsv.CSVReader; import objectRepo.HomePageRepo;
 * 
 * public class HomePage extends HomePageRepo { WebDriver driver;
 * //WebDriverWait webDriverWait; String id; String csvFile=
 * "C:\\Users\\rekha\\selenium\\src\\test\\resources\\newcustomerdetails.csv";
 * 
 * //private By createNewCustomerLink;
 * 
 * public HomePage(WebDriver driver) { this.driver = driver;
 * 
 * 
 * }
 * 
 * 
 * createNewCustomerLink() throws FileNotFoundException { CSVReader reader =
 * null; reader = new CSVReader(new FileReader(csvFile)); return new
 * HomePage(driver);
 * 
 * driver.findElement(customerName).sendKeys("customerName");
 * driver.findElement(gender).click(); driver.findElement(dob).sendKeys("dob");
 * driver.findElement(address).sendKeys("address");
 * driver.findElement(city).sendKeys("city");
 * driver.findElement(state).sendKeys("state");
 * driver.findElement(pincode).sendKeys("pincode");
 * driver.findElement(mobilenumber).sendKeys("mobilenumber");
 * driver.findElement(email).sendKeys("email");
 * driver.findElement(password).sendKeys("password");
 * driver.findElement(submit).click();
 * 
 * id = driver.findElement(CustomerID).getText(); System.out.println(
 * "New Customer is created with id: "+id); return id; } }
 * 
 * 
 * return id;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * // } /* Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(10,
 * TimeUnit.SECONDS) .pollingEvery(5,
 * TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
 * .ignoring(IllegalStateException.class).withMessage("will wait 5 secs");
 * wait.until(ExpectedConditions.presenceOfElementLocated(
 * createNewCustomerLink)).click();
 */
// return id;
