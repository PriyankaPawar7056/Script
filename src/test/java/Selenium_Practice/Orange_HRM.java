package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_HRM {
	
	@Test
	public void test_001() throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();    //chromedriver Executable
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement txt_username=driver.findElement(By.xpath("//input[@name='username']"));
		txt_username.sendKeys("Admin");
		
		WebElement txt_Password=driver.findElement(By.xpath("//input[@name='password']"));
		txt_Password.sendKeys("admin123");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@type='submit']"));
		btn_login.click();
		
		}
	
	@Test
    public void InvalidDatatest_002() throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();    //chromedriver Executable
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement txt_username=driver.findElement(By.xpath("//input[@name='username']"));
		txt_username.sendKeys("Adm");
		
		WebElement txt_Password=driver.findElement(By.xpath("//input[@name='password']"));
		txt_Password.sendKeys("admin");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@type='submit']"));
		btn_login.click();
	}

}
