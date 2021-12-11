package org.sample;

import org.Util.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PbiPojo extends BaseClass {
	public PbiPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Insurance Products ']")
	private WebElement ddInsurance;
	
	@FindBy(xpath="(//span[text()='Home Insurance'])[1]")
	private WebElement homeInsurance;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement txtName;
	
	@FindBy(xpath="(//input[@type='tel'])[1]")
    private WebElement mobNo;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailId;
	

	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement lnBtn;


	
	public WebElement getDdInsurance() {
		return ddInsurance;
	}
   public WebElement getHomeInsurance() {
		return homeInsurance;
	}
   public WebElement getTxtName() {
		return txtName;
	}
   public WebElement getMobNo() {
		return mobNo;
	}
  public WebElement getEmailId() {
		return emailId;
	}
  public WebElement getLnBtn() {
		return lnBtn;
	}

}
