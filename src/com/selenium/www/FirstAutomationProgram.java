package com.selenium.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		// to naviagate us to specific web page
		
		Thread.sleep(3000);
		
		d.manage().window().maximize();
		// it will maximize the window
		
		
		String s=d.getCurrentUrl();
		System.out.println(s);
		
		System.out.println(d.getCurrentUrl());
		
		
		
		

	}

}
