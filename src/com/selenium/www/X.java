package com.selenium.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("demo");
		
		driver.findElement(By.xpath("(//form[@id='login_form']/input)[2]")).sendKeys("demo1");
		
		

	}

}
