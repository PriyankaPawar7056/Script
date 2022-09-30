package POM_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;      //To make  WebDriver accessible to all that's why  place outside the method 
	
	@BeforeMethod
	public void setup() {
	
		
		//Browser opening code
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void teadDown() {
		driver.quit();
	}

}
