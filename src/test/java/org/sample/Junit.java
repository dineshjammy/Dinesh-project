package org.sample;

import java.util.Date;

import org.Util.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeClass;


public class Junit extends BaseClass {
	@org.junit.BeforeClass
	public static  void launch() {
		launchChrome();
		loadUrl("http://www.facebook.com");
		winMax();
	}
//	@AfterClass
//	public static void closingBrowser() {
//		closeChrome();
//	}
	@Before
	public   void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public  void endTime() {
		System.out.println(new Date());
   }
	//user name
	@Test
	public   void tc2() {
		FBLoginPagePojo f = new FBLoginPagePojo();
		fill(f.getTxtUser(), "Greens"); 
	}
	//click btn
	@Test
	public    void tc3() {
		FBLoginPagePojo f = new FBLoginPagePojo();
		btnClick(f.getBtnLogin());
}
	@Test
	public  void tc1() {
		FBLoginPagePojo f = new FBLoginPagePojo();
		fill(f.getTextPass(), "Greens@12345");

	}
	
	}

