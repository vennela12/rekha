package TestingGroups;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {
	@Test(groups = ("bvt"))
	public void bvtclass2() {
		System.out.println("bvt class2");

	}

	@Test(groups = ("regression"), priority = 1)
	public void regressionclass2() {
		System.out.println("regression class2");
	}

	@Parameters(("firstname"))
	@Test(groups = ("regression"), priority = 2)
	public void testingparameters(String firstName) {
		System.out.println(firstName);

	}

	@Test(groups = ("priority"))
	public void priorityclass2() {
		System.out.println("priority class2");

	}

}
