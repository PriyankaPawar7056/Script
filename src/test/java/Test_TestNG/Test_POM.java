package Test_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_POM {
	
	@Test
	public void Verifyloginpage() {
		
		//browser open code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Login_POM login=PageFactory.initElements(driver, Login_POM.class);     //HnadOver initElements to Login_POM class
	  login.getTxt_email().sendKeys("Priyanka7056");        //directly call the email web-element
	  
	  login.getTxt_password().sendKeys("priyanka123");
	  
	  login.getBtn_login().click();
	 
		
		}
	
	@Test
	public void VerifyLoginPageWithInvalidData(){
		
		
		//browser open code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
          Login_POM login=PageFactory.initElements(driver, Login_POM.class); 
		  login.getTxt_email().sendKeys("Priyanka");        //directly call the email web-element
		  
		  login.getTxt_password().sendKeys("priyanka123");
		  
		  login.getBtn_login().click();
		 
	}
	
	
	
	
	
	
	
	
	
	
	

}
