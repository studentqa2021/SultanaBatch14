package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin { 
	
		
 public static void login(){
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // for chrome
	WebDriver driver = new ChromeDriver();
	//driver.get("http://automationpractice.com/index.php");
	driver.navigate().to("http://automationpractice.com/index.php");
	/*driver.navigate().refresh();//to refresh page
	driver.navigate().forward();
	driver.navigate().back();*/
	driver.manage().window().maximize();// max size
	//driver.manage().window().fullscreen();//full size
	
	driver.findElement(By.xpath("//*[@class='login']")).click();//first sign in
	//driver.findElements(by);
	//email =//*[@id='email']
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
	driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");
	driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	driver.close();
	driver.quit();
	

}


}