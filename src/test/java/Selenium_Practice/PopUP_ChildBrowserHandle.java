package Selenium_Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUP_ChildBrowserHandle {
	
	//  ChildBrowser_PopUP
	
	@Test
	public void ChildBrowserPopUp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentwindowAddress=driver.getWindowHandle();
		System.out.println(parentwindowAddress);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> allAddress=driver.getWindowHandles();
		System.out.println(allAddress);
		
		Iterator<String> It=allAddress.iterator();
	
		while(It.hasNext()) {
	
			String childwindowAddress=It.next();
			
			if(!parentwindowAddress.equalsIgnoreCase(childwindowAddress)) {
				
				driver.switchTo().window(childwindowAddress);
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test");
				
				driver.close();
				//  driver.quit();
			}
	}
		
		driver.switchTo().window(parentwindowAddress);
		driver.close();

	}
}
