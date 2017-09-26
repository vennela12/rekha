package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;


public class CollectionsTutorial {

	@Test
	public void CollectoionTest() {
		/*
		 * Collection collIntro = new ArrayList<>(); 
		 * collIntro.add(1);
		 * collIntro.add("a"); 
		 * collIntro.add(2); 
		 * for (Object object : collIntro)
		 * { System.out.println(object);
		 * 
		 * }
		 */

		/*List aList = new ArrayList<>();
		aList.add(1);
		aList.add("a");
		aList.add(2,"b");
		aList.add(1);
		for (Object object : aList) {
			System.out.println(object);

		}*/
		
		/*Set aSet = new HashSet<>();
		aSet.add(1);
		aSet.add(2);
		for (Object object : aSet) {
			System.out.println(object);
			
		}*/
		
 Map aMap = new HashMap<>();
 aMap.put(1, "a");
 aMap.put(2, "b");
 
 Set aSet = aMap.keySet();
 for (Object object : aSet) {
	 System.out.println(aMap.get(object));
	
}
 
  	
}
 
		
		
		
		
		
		//Set
		//Map
		

	}

