package Test_TestNG;

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

public class Test_1 {
	
	//Before Annotation
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
	public void BM () {
		//Browser open code
		System.out.println("Before Method");	
	}
	@Test(priority=1)
	public void testb() {
		
		System.out.println("Testb");      // 1) In TestNG by-default Test Cases Execute Alphabetically
		                                  //2) If we give priority to test case then it execute first low priority that is 0 then 1 (@Test(priority=0))
	}
	@Test(priority=0)
	public void testa() {
		
		System.out.println("Testa");
		
	}
	
	//After Annotation
	@AfterMethod
	public void AM() {
		//Browser close code
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
