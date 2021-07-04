package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MasterPageFactory {//java encapsulation
public MasterPageFactory(WebDriver driver) {//to remove null pointer exception
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='login']")//selenium
	private WebElement signinbtn;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement pass;
	
	@FindBy(xpath="//*[contains(@id,'SubmitLogin')]")
	private WebElement loginbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
			
	


