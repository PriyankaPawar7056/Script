package Test_TestNG;

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

public class Test_Scroll {
	
	@Test
	public void VerifyTest_001() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//Scroll By Pixel
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)", "");
		
		//Scroll By WebElement
		WebElement txt_Hindi=driver.findElement(By.xpath("//a[@title='Hindi']"));
		js.executeScript("arguments[0].scrollIntoView();", txt_Hindi);
		
		//Scroll By direct web-page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		//To call Scroll 
		ScrollToElement(driver,txt_Hindi);
		
		//To Call get Screen Shot Capture
		getScreenShotCapture(driver);
		getScreenShotCapture(driver);
		
		
		}
	
	//*******************OR
	
	//Also we can create generic methods
	public static void ScrollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void getScreenShotCapture(WebDriver driver) throws IOException {
		
		String RS=RandomString.make(3);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\rpgsa\\eclipse-workspace\\Demo_Batch_10A\\ScreenShot\\FB_Module\\FBlogin"+RS+".png");
		FileUtils.copyFile(source, dist);
	}

}
