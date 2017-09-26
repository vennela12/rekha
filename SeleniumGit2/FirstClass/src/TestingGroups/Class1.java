package TestingGroups;

import org.testng.annotations.Test;

public class Class1 {

	@Test(groups = ("bvt"))
	public void bvtclass1() {
		System.out.println("bvt class1");

	}

	@Test(groups = ("regression"), priority = 3)
	public void regressionclass1() {
		System.out.println("regression class1");

	}

	@Test(groups = ("priority"))
	public void priorityclass1() {
		System.out.println("priority class1");

	}

}
