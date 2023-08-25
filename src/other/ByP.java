package other;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByP {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// bu using pixels
		//js.executeAsyncScript("window.scrollBy(0,500)", "");
		
		// upto the element
		WebElement e=driver.findElement(By.xpath("//td[@width='65%']/button"));
		
		//js.executeScript("arguments[0].scrollIntoView();",e);
		
		Thread.sleep(2000);
		
		// upto bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		

	}

}
