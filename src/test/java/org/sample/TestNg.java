package org.sample;

import org.Util.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg extends BaseClass  {
	@BeforeClass
	public static  void launchChrome() {
		launchChrome();
		System.out.println("chrome");

	}
@AfterClass
public static  void chrome() {
 System.out.println("close");
 
}

@BeforeMethod
public static  void startTime() {
	System.out.println("start");

}

@AfterMethod
public static void endTime() {
	System.out.println("end");

}
@Test
public static   void tc1() {
System.out.println("Test1");
}
public void sreenShot() {
}
}
