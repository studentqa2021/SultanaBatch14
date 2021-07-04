package com.generic;
import javax.swing.text.Highlighter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLoginPHPTravel {
	public void getlogin() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// 1
		driver.navigate().to("https://phptravels.com/demo/");
		driver.manage().window().maximize();

		WebElement singinbtn = driver
		.findElement(By.xpath("//*[@class='lvl-0 sign-in btn btn-md btn-white-outline']"));
		singinbtn.click();

	
 
	}

	
		
	}
	



