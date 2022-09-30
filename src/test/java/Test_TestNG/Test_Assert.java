package Test_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Assert {
	
	@Test
	public void VerifyTest_001() {
		
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	
	//To verify String
	String actual="Test";
	String expected="Test";  //pass
	Assert.assertEquals(actual, expected);        //assert String actual and expected method call here
	
	Assert.assertEquals(txt_email.isEnabled(), true);  //true //	Assert.assertEquals(Boolean actual , Boolean expected ) METHOD USED
	         //we use assert/Hard Assert here // Actual and expected result same or not
	System.out.println(txt_email.isEnabled());   //true  //Actual and expected result same true=true
	System.out.println("Test");
	System.out.println("Hello");

	//If Assert Fails then it Abbot the test steps execution and Continue with next test case execution
	
	
	//if(txt_email.isEnabled()==true) {
		                                   //************Check
		
	//}
		
		}
	
	@Test
     public void VerifyTest_002() {
		
		SoftAssert soft=new SoftAssert();          //Create object of SoftAssert
		
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		
	       soft.assertEquals(txt_email.isEnabled(), true); //pass //actual = expected test case pass
	          System.out.println("TestCase");
	          
	          soft.assertTrue(false); //fail    // soft.assertTrue(boolean value);  METHOD USED
	          System.out.println("BugSpotter");
	          
	          soft.assertAll();
	          
	//If assert fail then does not abbot the test case execution instead of it continue with next test steps
	//AssertAll() method omit All exception which pick by SoftAssert Class Assert  
	//Means it pick all the exception and at the end if he get soft.assertAll(); METHOD then he throw the all exception
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
