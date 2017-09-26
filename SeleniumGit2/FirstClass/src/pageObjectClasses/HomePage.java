package pageObjectClasses;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepo.HomePageRepo;

public class HomePage extends HomePageRepo {
	WebDriver driver;
	WebDriverWait webDriverWait;
	
	String id;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public String clickOncreateNewAccount () {
		//ref http://www.selemiumeasy.com/selenium-tutorial
//		Wait<WebDriver> wait = new FluentWait<>(driver)
//				.withTimeout(10, TimeUnit.SECONDS)
//				.pollingEvery(5, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class)
//				.ignoring(IllegalStateException.class)
//				.withMessage("will wait 5 secs");
//		wait.until(ExpectedConditions.presenceOfElementLocated(createNewAccountLink)).click();	
		
		
		
		
		driver.findElement(createNewAccountLink).click();
		
		  driver.findElement(customerName).sendKeys("Thomas"); 
		  driver.findElement(gender).click(); 
		  driver.findElement(dob).sendKeys("02/12/1987");
		  driver.findElement(address).sendKeys("test test test");
		  driver.findElement(city).sendKeys("Austin");
		  driver.findElement(state).sendKeys("Texas");
		  driver.findElement(pincode).sendKeys("342561");
		  driver.findElement(mobilenumber).sendKeys("3456789234");
		  driver.findElement(email).sendKeys("rekhatestxyz0000@gmail.com");
		  driver.findElement(password).sendKeys("4356200891");
		  driver.findElement(submit).click();
		  
		  id = driver.findElement(CustomerID).getText();
			System.out.println(id);
			return id;
			
	}
	public EditCustomer PassingDriver() {
		return new EditCustomer(driver);
		
	}
	
	/*public DltCustomer PassingDriver() {
		return new DltCustomer(driver);*/
		
	}
	
	
	
	
	
	
	
	


	
	
	


