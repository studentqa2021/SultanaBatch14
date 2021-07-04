package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeLogIn {
	public void baselogin(){
	//open any browser
		 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.navigate().to("http://automationpractice.com");
	//go to the URL
	driver.navigate().to("http://automationpractice.com/index.php");
	//how to maximize the browser
	driver.manage().window().maximize();
	//click login btn
	WebElement signinbtn= driver.findElement(By.xpath("//(*[@class='login']"));
	
	}
	
	
}
