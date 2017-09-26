package utilities;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
	
	WebDriver driver;
	WebDriverWait webDriverWait;
	
	public Utilities (WebDriver driver) {
		this.driver = driver;
		
	}

	
	
	public void fillInTextBoxInfo(By path, String SomeString) {
		
		webDriverWait = new WebDriverWait(driver, 3,100);
		
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(path)).sendKeys(SomeString);
		
		
	}
	
public void click(By path) {
		
		webDriverWait = new WebDriverWait(driver, 3,100);
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(path)).click();
		
		
	}

public void dropdown(By path, String string) {
	Select dropdown = new Select(driver.findElement(path));
	dropdown.selectByVisibleText(string);
	
}

public void radiobutton(By path) {
	webDriverWait.until(ExpectedConditions.presenceOfElementLocated(path)).click();
	//Select radiobutton = new Select(driver.findElement(path));
	
	
}






	
	
}


