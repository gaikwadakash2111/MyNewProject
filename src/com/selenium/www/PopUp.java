package com.selenium.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//pop-up will open
		// we have to add UN & PWD after https
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		
	}

}
