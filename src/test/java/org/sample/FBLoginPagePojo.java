package org.sample;

import org.Util.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class FBLoginPagePojo extends BaseClass {
	
	public FBLoginPagePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement txtUser;
		
	@FindBy(id="pass")
	private WebElement textPass;
		
	@FindBy(xpath="//button[@name = 'login']")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTextPass() {
		return textPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	}

  


