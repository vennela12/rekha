package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		
		driver.get("http://guru99.com"); //Get(string arg0 ) to hit url
		
	    System.out.println(driver.getTitle());
	    
	    System.out.println(driver.getPageSource());
		
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.close();
		
	}	
	
	}

