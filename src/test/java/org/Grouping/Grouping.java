package org.Grouping;

import java.util.Date;

import org.Util.BaseClass;
import org.sample.FBLoginPagePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping extends BaseClass {
	@BeforeClass(alwaysRun=true)
	private void launch() {
    launchChrome();
	winMax();
	loadUrl("http://www.facebook.com");
	}
	
	@AfterClass
	private void close() {
    closeChrome();
	}
	
	@BeforeMethod
	private void startTime() {
    System.out.println(new Date());
	}
	@AfterMethod
	public void endTime() {
    System.out.println(new Date());
	}
	
	@Test(groups= "Smoke")
	public void tc1() throws InterruptedException {
    FBLoginPagePojo a = new FBLoginPagePojo();
    fill(a.getTxtUser(), "Greens");
    fill(a.getTextPass(), "Greens@112345");
    btnClick(a.getBtnLogin());
    Thread.sleep(2000);
	
	}
	
	@Test(groups= "Sanity")
	public void tc2() throws InterruptedException {
    FBLoginPagePojo b = new FBLoginPagePojo();
    fill(b.getTxtUser(), "Dinesh");
    fill(b.getTextPass(), "Dinesh@12345");
    btnClick(b.getBtnLogin());
    Thread.sleep(2000);
	}
	
	@Test(groups= "Regreesion")
	public void tc3() throws InterruptedException {
    FBLoginPagePojo c = new FBLoginPagePojo();
    fill(c.getTxtUser(), "Mani");
    fill(c.getTextPass(), "Mani@12345");
    btnClick(c.getBtnLogin());
    Thread.sleep(2000);
	}
	
	@Test(groups= "Sample")
	public void tc4() throws InterruptedException {
    FBLoginPagePojo d = new FBLoginPagePojo();
    fill(d.getTxtUser(), "Jai");
    fill(d.getTextPass(), "Jai@12345");
    Thread.sleep(2000);
}
}
	
	


