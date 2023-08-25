package com.selenium.www;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		
		
		// download the jar files 
		
		// full screenshot
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(src, new File("C:\\Users\\user\\Desktop\\screenshots\\1.docs"));
        System.out.println("u r done");
	}

}
