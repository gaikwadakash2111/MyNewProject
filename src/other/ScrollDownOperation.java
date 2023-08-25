package other;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownOperation {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// scroll down by using pixels
		
		//js.executeScript("window.scrollBy(0,500)","");
		
		// scroll down upto the element
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		//js.executeScript("arguments[0].scrollIntoView();",mouseHover);
		
		//upto bottom
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		

	}

}
