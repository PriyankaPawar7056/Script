package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	
	@BeforeSuite
		public void BS() {
		System.out.println("Before Suite");
		
			}
	
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	
	//Browser Open Code
	public void BM() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		System.out.println("Before Method");
	}
	
	@Test
	public void VerifyLoginPage_TC_001() {
		
	
		System.out.println("Test_1");
	}
	
	@Test
	public void Test_2() {
		System.out.println("Test_2");
	}
	
	@AfterMethod
	
	//Browser Close Code
	public void AM() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}
	

}
