package com.selenium.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTechniques {

	public static void main(String[] args) throws InterruptedException {
		
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://login.salesforce.com/?locale=in");
	      
	      driver.manage().window().maximize();
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("sharad");
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//form[@id='login_form']/input[2]")).sendKeys("sharad1999");
	      
	     // driver.close();
	        // to close the window
	      
	      driver.quit();

	}

}
