package testClasses;

import java.util.Map;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjectClasses.DltCustomer;
import pageObjectClasses.EditCustomer;
import pageObjectClasses.HomePage;
import pageObjectClasses.LoginPage;
import utilities.BaseClass;

public class CreateNewAccount extends BaseClass{
	
	@Parameters({"browser","endRow", "startRow","csvFile"})
    public CreateNewAccount(String browser, int endRow, int startRow, String csvFile) {
		super(browser, endRow, startRow, csvFile);
		// TODO Auto-generated constructor stub
	}


	LoginPage loginpage;
    HomePage homepage;
    
    EditCustomer editcustomer;
    DltCustomer dltcustomer;
    
	
      
    @Test(dataProvider = "csvData")
    
    public void createNewAccountfromHomePage(Map<String, String> map){
    	
    	loginpage = navigateToApplication();
    	homepage = loginpage.Login(map);
    	
    	
    	
    	String cusid=homepage.clickOncreateNewAccount();
    	editcustomer=homepage.PassingDriver();
    	editcustomer.clickOnEditCustomer(cusid);
    	
    	//dltcustomer=homepage.PassingDriver();
    	//dltcustomer.clickOnDltCustomer(cusid);
    	

    	
    	
    	
    	//CloseBrower();
    }

	
	
}
