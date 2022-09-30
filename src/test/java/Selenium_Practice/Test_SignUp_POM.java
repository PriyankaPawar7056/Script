package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_SignUp_POM {
	
	WebDriver driver;
	@Test
	public void VerifySignUpWithValidData_TC001() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		SignUp_POM signUp=PageFactory.initElements(driver, SignUp_POM.class);
		signUp.gettxt_firstName().sendKeys("Priyanka");
		signUp.gettxt_lastName().sendKeys("Pawar");
		
		
	}

	
	@Test
	public void VerifySignUpWithInvalidData() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		SignUp_POM SignUp=PageFactory.initElements(driver, SignUp_POM.class);
		SignUp.gettxt_firstName().sendKeys("rani");
		SignUp.gettxt_lastName().sendKeys("paw");
	}
}
