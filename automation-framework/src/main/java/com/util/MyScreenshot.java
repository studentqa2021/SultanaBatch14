package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class MyScreenshot {
	public static void addScreenShot(WebDriver driver, String name){
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		//
		//FileUtils.copyFile(scrFile, new File("./ScreenShot/"+name+".png"));
		
	


File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
	FileUtils.copyFile(scrFile, new File("./ScreenShot/"+name+".png"));
} catch (IOException e) {

	e.printStackTrace();
}
}
}