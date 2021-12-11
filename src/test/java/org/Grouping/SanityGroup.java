package org.Grouping;

import org.testng.annotations.Test;

public class SanityGroup {
	
	@Test(groups="Sanity")
    private void tc31() {
    System.out.println("Test31");
	}
	
	@Test(groups="Sanity")
	private void tc32() {
    System.out.println("Test32");
	}
	
	@Test(groups="Smoke")
	private void tc33() {
    System.out.println("Test33");
	}
	
	@Test(groups="Regreesion")
    private void tc34() {
	System.out.println("Test34");
	}
	
	@Test(groups="Smoke")
	private void tc35() {
    System.out.println("Test35");
	}

}

