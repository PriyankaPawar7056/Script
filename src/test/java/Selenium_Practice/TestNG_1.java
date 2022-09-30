package Selenium_Practice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_1 {
	
	WebDriver driver;
	
	@BeforeMethod
		public void BM() {
			
			//Browser Open Code
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/V4/");
			driver.manage().window().maximize();
			
			System.out.println("Before Method");
		}
		
		@Test(priority=1)
		public void TC_001_VerifyLoginPage() throws InterruptedException {
			
			WebElement txt_login=driver.findElement(By.xpath("//input[@name='uid']"));
			txt_login.sendKeys("Priyanka");
			Thread.sleep(2000);
			
			WebElement txt_pass=driver.findElement(By.xpath("//input[@name='password']"));
			txt_pass.sendKeys("Priyanka@123");
			Thread.sleep(2000);
			
			Assert.assertTrue(false);
		
			
			System.out.println("Test_V");
		}
		
		@Test(priority=2,dependsOnMethods="TC_001_VerifyLoginPage")
		public void TC_002_VerifySignUpPage() throws InterruptedException {
			
			WebElement txt_login=driver.findElement(By.xpath("//input[@name='uid']"));
			txt_login.sendKeys("Priyanka");
			Thread.sleep(2000);
		
		
		}
		
		@Test(priority=-1,invocationCount=2)
		public void Test_b() throws InterruptedException {
			
			WebElement txt_login=driver.findElement(By.xpath("//input[@name='uid']"));
			txt_login.sendKeys("Priyanka");
			Thread.sleep(2000);
			System.out.println("Test_b");
		}
		
		
		@Test(priority=0,enabled=false)
		public void Test_a() throws InterruptedException {
			
			WebElement txt_login=driver.findElement(By.xpath("//input[@name='uid']"));
			txt_login.sendKeys("Priyanka");
			Thread.sleep(2000);
			System.out.println("Test_a");
		}
		
		@AfterMethod
		
		public void AM() {
			//Browser Close Code
			driver.quit();     //It close current and all current working browser
			System.out.println("After Method");
		}
		

}
