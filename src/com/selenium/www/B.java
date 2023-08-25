package com.selenium.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement e= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		e.click();
		
		List<WebElement> b=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//for(WebElement k: b)
		//{
		//	k.click();
		//}
		
		for(int i=0; i<b.size(); i++)
		{
			b.get(i).click();
		}

	}

}
