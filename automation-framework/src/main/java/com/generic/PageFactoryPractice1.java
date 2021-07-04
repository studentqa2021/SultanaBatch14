package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig1;
import com.util.Highlighter;
import com.util.MyScreenshot;



public  class  PageFactoryPractice1 {

 public static void	pageFactoryCoding() {
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 
	 driver.navigate().to(BaseConfig1.getConfigValue("URL"));

	 driver.manage().window().maximize();
	System.out.println(driver.getCurrentUrl());
	//WebElement signIn = driver.findElement(By.xpath("//*[contains(@class,'login')]"));
	 //WebElement signIn= driver.findElement(By.xpath("//*[contains(text(),'SignIn'"));//here used text method to find the xpath
	//signIn.click();
	MasterPageFactory obj= new MasterPageFactory(driver);
	MyScreenshot.addScreenShot(driver, "this is before login");
	Highlighter.addColor(driver,obj.getSigninbtn());
	obj.getSigninbtn().click();
	MyScreenshot.addScreenShot(driver, "this is after first login");

	Highlighter.addColor(driver,obj.getEmail());
	obj.getEmail().sendKeys(BaseConfig1.getConfigValue("user"));
	Highlighter.addColor(driver,obj.getPass());
	obj.getPass().sendKeys(BaseConfig1.getConfigValue("password"));
	obj.getLoginbtn().click();
	
	
	
 }
 

	
}
	
	


