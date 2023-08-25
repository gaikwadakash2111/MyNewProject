package com.selenium.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacadjoihdgfhgikgknionPractice/");
		
		Thread.sleep(1000);
		
		WebElement e=driver.findElement(By.xpath("//input[@id='alertbtn']"));
		
		e.click();
		
		Thread.sleep(1000);
		
		//driver.switchTo().alert().accept();
		
		String alertText=driver.switchTo().alert().getText();
		
		System.out.println(alertText);
		
		Thread.sleep(100);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
	

	}

}
