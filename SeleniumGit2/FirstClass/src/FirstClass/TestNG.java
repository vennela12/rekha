package FirstClass;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG {
//
//	@AfterMethod
//	public void testingAfterMethod() {
//		System.out.println("Iam running After Method");
//	}
//
//	@Test
//	public void TestingTest() {
//		System.out.println("Test1");
//	}
//
//	@BeforeTest
//	public void TestingTest2() {
//		System.out.println("Test2");
//
//	}
//
//	@AfterTest
//	public void TestingTest3() {
//		System.out.println("Test5");
//	}
//
//	@Test
//	public void Middle() {
//		System.out.println("Test3");
//	}
//
//	@Test
//	public void Middle2() {
//		System.out.println("Test4");
//
//	}
//
//	@Test(enabled = false)
//	public void dependsONMethodExample() {
//		System.out.println("false enabled");
//	}
//
	@Test(timeOut = 3000)
	public void timeOutExample() {
		System.out.println("Time Out");
	}
	
	@Test(groups = { "regresion" })	
	public void checkGroupRegression() {
		System.out.println("from Regression");
	}
	
	@Test(dataProvider = "giveData")
		public void getDataFromDataProvider(Object t, Object x){
		System.out.println(t+""+x);
		
		
	}

	@DataProvider
	public Object[][] giveData(){
		Object[][] someData = new Object[4][2];
		someData[0][0]="apple";
		someData[0][1]="apple fruit";			
		someData[1][0]="mango";
		someData[1][1]="mango fruit";
		someData[2][0]="cherry";
		someData[2][1]="cherry fruit";
		someData[3][0]="banana";
		someData[3][1]="banana fruit";
		return someData;
		
	}
}
