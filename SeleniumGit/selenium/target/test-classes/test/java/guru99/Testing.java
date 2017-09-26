package guru99;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing {

	String browser;
	WebDriver driver;
	WebElement element;

	@Parameters({ "browser" })
	public Testing(String browser) {
		this.browser = browser;
		System.out.println(browser);
			

}
	@BeforeTest
	public void FireBrowser() {
		System.out.println("This is firefox" + browser);
		switch (browser) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		}

	}
	
	@Test
	public void Navigate() {
		driver.navigate().to("http://demo.guru99.com/v4/index.php");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr90732");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("bAgepam");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	}
	
	/*@Test
	public void NewCustomer(){
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Michaes");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("09/05/1980");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")).sendKeys("2550 Millbrook");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("Austin");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("TX");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("786754");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")).sendKeys("9876546789");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys("rekha2@gmail.com");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("welcome");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
	}*/
		
		@Test(dependsOnMethods="Navigate")
		public void Edit(){
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("84044");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")).click();
		}
	
	
	
		@Test(dependsOnMethods="Edit")
		 public void validation(){
		  try {
		   Thread.sleep(2000);
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
	
		  String nameTest=driver.findElement(By.xpath("//input[contains(@name,'name')]")).getAttribute("value");
		  nameTest.toString();
		  System.out.println(nameTest);
		  try {
		   Thread.sleep(2000);
		  } catch (InterruptedException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  Assert.assertEquals(nameTest,"Michael" );
		  
		 }
		}
		
		
		
		
		
		
		
		
	
	




