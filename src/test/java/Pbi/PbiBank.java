package Pbi;

import java.util.Date;

import org.Util.BaseClass;
import org.sample.PbiPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PbiBank extends BaseClass {
	
	@BeforeClass
	private void laun() {
		launchChrome();
		winMax();
		printTitle();
		printCurrentUrl();

	}

	@AfterClass
	private void close() {
     closeChrome();
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println(new Date());
		loadUrl("https://www.policybazaar.com/");
   }
	
	@AfterMethod
	private void endTime() {
      System.out.println(new Date());
	}
	
	@Test
	private void tc1() {
		PbiPojo a = new PbiPojo();
		moveElementTo(a.getDdInsurance());
		moveElementTo(a.getHomeInsurance());
		btnClick(a.getHomeInsurance());
		fill(a.getTxtName(), "Dinesh");
		fill(a.getMobNo(), "8963214577");
		fill(a.getEmailId(), "Dinesh@2594gmail.com");
	   btnClick(a.getLnBtn());

	}
}
