package Test_TestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {
	
	WebDriver driver;
	
	@Parameters("BrowserName")     //This name is same as xml parameter name
	@BeforeMethod
	public void BM(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			//Browser open code
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();                          //Here only write  driver=new ChromeDriver();    
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
		}
		else if (BrowserName.equalsIgnoreCase("Edge")) {
			//Browser open code
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();                          //Here only write   driver=new EdgeDriver(); 
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	    }
	}
	@Test(priority=2)
	public void Test_3(){
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test");
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123456789");
		System.out.println("c");
		Assert.assertTrue(false); //We fail the test_3 by using Assert for checking the execution of dependencies test cases it shows SKIPPED: Test_4
	}
	@Test(priority=0,invocationCount=3)
	public void Test_1(){
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test");
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123456789");
		System.out.println("a");
	}
	@Test(priority=1,enabled=false)
	public void Test_2(){
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test");
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123456789");
		System.out.println("b");
	}
	@Test(priority=3,dependsOnMethods="Test_3")
	public void Test_4(){
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test");
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123456789");
		System.out.println("d");
		
	}
	
	@AfterMethod
	public void AM (){
		//Browser Close code
		
		//Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
	

	
}
