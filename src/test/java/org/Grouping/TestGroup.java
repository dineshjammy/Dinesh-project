package org.Grouping;

import org.testng.annotations.Test;

public class TestGroup {
	
	@Test(groups="Smoke")
	private void tc11() {
    System.out.println("Test11");
	}
	
	@Test(groups="Sample")
    private void tc12() {
    System.out.println("Test12");
    }
	
    @Test(groups="Test")
    private void tc13() {
    System.out.println("Test13");
    }
    @Test(groups="Sanity")
    private void tc14() {
    System.out.println("Test14");
	}
    
    @Test(groups="Regreesion")
    private void tc15() {
    System.out.println("Test15");
	}
}

