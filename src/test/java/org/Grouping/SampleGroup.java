package org.Grouping;

import org.testng.annotations.Test;

public class SampleGroup {
	
	@Test(groups="Sample")
    private void tc21() {
    System.out.println("Test21");
	}
	
	@Test(groups="Test")
    private void tc22() {
    System.out.println("Sanity");
	}
	
	@Test(groups="Smoke")
    private void tc23() {
	System.out.println("Test23");
	}
	
	@Test(groups="Regression")
	private void tc24() {
    System.out.println("Test24");
	}
	
	@Test(groups="Smoke")
	private void tc25() {
    System.out.println("Test25");
	}
}
