package com.selenium.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllLinkisOnWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> obj=driver.findElements(By.xpath("//td[@data-month='6']"));
		
		Thread.sleep(1000);
		
		for(WebElement k:obj)
		{
			if(k.getText().equalsIgnoreCase("28"))
			{
				k.click();
				break;
			}
		}

	}

}
