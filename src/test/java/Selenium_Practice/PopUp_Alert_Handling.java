package Selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp_Alert_Handling {
	
	
	@Test
	public void VerifyAlert() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement btn_ligin=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_ligin.click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();   // Click on Ok
	//	alt.dismiss();   // Click on Cancel
		
		Alert alt_1=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt_1.accept();
		
		
		driver.quit();
	}

}
