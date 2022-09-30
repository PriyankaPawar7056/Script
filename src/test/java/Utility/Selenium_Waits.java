package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM_Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Waits {
	
	@Test
	public void test_001() {
		
		//browser open code
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// 1) Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //globally apply on all the element
		
		
		// 2) Explicit wait   
		//Apply individual web-element withRespectTo Expected conditions
		//There is no method to apply Explicit wait that's why we create object of WebDriverWait
		
	   WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(email));
		
		//****OR from direct Library framework
		Library.getExpliciteWait(driver, email,10);
		Library.getExpliciteWait(driver, email, 20);
		
		
		
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
