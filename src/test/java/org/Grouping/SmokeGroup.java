package org.Grouping;

import org.testng.annotations.Test;

public class SmokeGroup {
	
	@Test(groups="Sample")
    private void tc41() {
    System.out.println("Test41");
	}
	
	@Test(groups="Test")
	private void tc42() {
    System.out.println("Test42");
	}
	
	@Test(groups="Test")
    private void tc43() {
    System.out.println("Test43");
	}
	
	@Test(groups="Sample")
    private void tc44() {
    System.out.println("Test44");
	}
	
	@Test(groups="Regreesion")
	private void tc45() {
    System.out.println("Test45");
	}
}
