package Inheritance;

import org.testng.annotations.Test;

public class MainTut extends BaseClassOld {
	
	@Test
	public void runIt() {
		BaseClassOld t= new BaseClassOld();
		t.jutPrint();
		
		jutPrint();
		
	}

}
