package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;


public class Customized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("vennela");
		driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("welcome");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//popups on webpage
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		//dropdowns
		
	

	}

}