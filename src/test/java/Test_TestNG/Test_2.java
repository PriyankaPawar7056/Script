package Test_TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	
	WebDriver driver;   //we declare out side method because it is accessible to everywhere in the class
	
	@BeforeMethod
	public void BM() {
		//Browser Open
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test_1() {
		//Web Element Identify
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		//It gives error at driver because driver access is not globally that's why we use at the upper WebDriver driver;
		txt_email.sendKeys("BugSpotter");
	}
	
	@AfterMethod
	public void AM () {
		driver.quit();    //It close all current browser + All browser which is open at the time of execution
	}
	
	
	
	
	
	

}

	
	
	
	
	
	
	
	
	
	
	
	
