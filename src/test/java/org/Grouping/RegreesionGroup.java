package org.Grouping;

import org.testng.annotations.Test;

public class RegreesionGroup {
	
	@Test(groups="Smoke")
	private void tc1() {
		System.out.println("Test1");

	}
	
	@Test(groups="Regression")
	private void tc2() {
     System.out.println("Test2");
	}
	
	@Test(groups="Sanity")
	private void tc3() {
     System.out.println("Test3");
	}
	
	@Test(groups="Sample")
	private void tc4() {
   System.out.println("Test4");
	}
	
	@Test(groups="Test")
	private void tc5() {
   System.out.println("Test5");
	}

}
