package Test_TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow_PopUp {
	
	@Test
	public void VerifyTest_001() {
		
		//Browser open code
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentaddress=driver.getWindowHandle();  //return parent window address
		System.out.println(parentaddress);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();      //find-out x-path by textof click here button
		
		Set<String> alladdress=driver.getWindowHandles();    ////return parent as well as chide window unique address 
		Iterator<String>  IT=alladdress.iterator();
		
		while(IT.hasNext()) {
			String ChildWindowAddress=IT.next();
			
			if(!parentaddress.equalsIgnoreCase(ChildWindowAddress)) {
				
				driver.switchTo().window(ChildWindowAddress);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Priyanka");
				driver.close();
			}
		}
		
		driver.switchTo().window(parentaddress);
		driver.close();
		System.out.println(alladdress);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
