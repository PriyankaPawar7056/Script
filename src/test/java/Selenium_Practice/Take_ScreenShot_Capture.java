package Selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Take_ScreenShot_Capture {
	
	@Test
	public void Test_001() throws IOException, InterruptedException {
		
		// Browser Open Code
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.manage().window().maximize();
	
	
	// 1) Scroll By Pixel 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,500)", "");
//	Thread.sleep(2000);
	//js.executeScript("window.scrollBy(0,-500)", "");
	
	// 2) Scroll By WebElement
//	WebElement txt_Hindi=driver.findElement(By.xpath("//a[@title='Hindi']"));
    //  js.executeScript("arguments[0].scrollIntoView()", txt_Hindi);
	
   // 3) Scroll Direct WebPage Till Down
      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      
      
	// Take_ScreenShot_Capture 
	
	String Rs=RandomString.make(2);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\ScreenShot\\FB\\login\\Demo"+Rs+".png");
	FileUtils.copyFile(source, dest);
	
	
	
	

	
	
	
	
	
	
     
}
}