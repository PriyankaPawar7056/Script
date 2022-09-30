package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser_Testing {
	
	WebDriver driver;
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void BM(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/V4/");
			driver.manage().window().maximize();
			System.out.println("Browser Open - Chrome");
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://demo.guru99.com/V4/");
			driver.manage().window().maximize();
			System.out.println("Browser Open - Edge");
		}
		
	}
	
	@Test
	public void VerifyLoginPage() throws InterruptedException {
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='uid']"));
		txt_email.sendKeys("priyanka");
		Thread.sleep(2000);
		
		WebElement txt_pass=driver.findElement(By.xpath("//input[@name='password']"));
		txt_pass.sendKeys("Rani@123");
		}
	
	@AfterMethod
	public void AM() {
		
		driver.quit();
	}

}
