package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_Assert_Verify {
	
	// 1)  Assert / Hard Assert
	
	@Test
	public void Test_001() {
		
		// Browser Open Code
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
	driver.manage().window().maximize();
	
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
	
	Assert.assertEquals(txt_email.isEnabled(), true);
	System.out.println(txt_email.isEnabled());
	System.out.println("Facebook Login Page");
	txt_email.sendKeys("Test");
	
     String Actual=" Priyanka ";
     String Expected=" Priyanka ";
     Assert.assertEquals(Actual, Expected);
	
	
	}
	
	// 2)  Verify / Soft Assert
	
	@Test
     public void Test_002() {
		
		SoftAssert soft=new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		
		soft.assertEquals(txt_email.isEnabled(), false);  //fail
		txt_email.sendKeys(" Priyanka ");
		System.out.println(" Test_002");
		
		soft.assertTrue(false);  //fail
		
		soft.assertAll();   //It omit all the exception at the end

}
}
