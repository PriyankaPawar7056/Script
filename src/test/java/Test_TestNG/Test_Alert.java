package Test_TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Alert {
	
	//PopUp Handling
	//  a) Alert
	//There is two methods
	//  A) alt.dismiss();
	//  B) alt.accept();
	
	@Test
	public void VerifyAlert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_submit.click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		//alt.dismiss();     //For cancel button
		alt.accept();        //For OK button
		
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
